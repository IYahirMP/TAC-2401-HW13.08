package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.accounting.OrderItem;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.sam.TriConsumer;
import com.solvd.laba.computer_repair_service.views.order.CreateOrderView;
import com.solvd.laba.computer_repair_service.views.order.ShowOrderView;

import java.util.HashMap;
import java.util.List;
import java.util.function.ToDoubleFunction;

public class OrderController{
    private int nextOrderId;
    private HashMap<Integer, Order> orders;
    private CreateOrderView createOrderView;
    private ShowOrderView showOrderView;

    private ToDoubleFunction<Task> taskCost = (t) -> t.getTypeOfTask().getCost();

    TriConsumer<LinkedList<OrderItem>, Task, Double> addItem = (a, b, c) -> {
        double cost = taskCost.applyAsDouble(b);

        OrderItem newItem = new OrderItem(
                b.getDescription(),
                cost,
                1
        );

        c += cost;
        a.add(newItem);
    };

    public OrderController() {
        nextOrderId = 0;
        orders = new HashMap<>();
        createOrderView = new CreateOrderView();
        showOrderView = new ShowOrderView();
    }

    public Order create(ServiceRequest request){
        createOrderView.display();

        Order newOrder;
        LinkedList<OrderItem> items = new LinkedList<>();
        LinkedList<Task> tasks = request.getTasks();

        List<Task> taskList = tasks.toArrayList();

        double total = 0.0;

        taskList.forEach((task) -> addItem.accept(items, task, total));

        newOrder = new Order(
                nextOrderId,
                total,
                Order.OrderState.ONGOING,
                items
        );

        System.out.println("Order created successfully");

        orders.put(nextOrderId, newOrder);
        nextOrderId++;

        return newOrder;
    }

    public void delete(int id){
        orders.remove(id);
    }

    public void update(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void show(int id){
        HashMap<String, Object> inputs = new HashMap<>();
        inputs.put("order", find(id));

        showOrderView.setInputs(inputs);
        showOrderView.display();
    }

    public Order find(int id){
        return orders.get(id);
    }

}
