package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.accounting.OrderItem;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.views.order.CreateOrderView;
import com.solvd.laba.computer_repair_service.views.order.ShowOrderView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.ToDoubleBiFunction;
import java.util.function.ToDoubleFunction;

public class OrderController{
    private int nextOrderId;
    private HashMap<Integer, Order> orders;
    private CreateOrderView createOrderView;
    private ShowOrderView showOrderView;

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
        double total = 0.0;

        ToDoubleFunction<Task> taskCost = (t) -> t.getTypeOfTask().getCost();

        for(Task task: tasks){
            double cost = taskCost.applyAsDouble(task);

            OrderItem newItem = new OrderItem(
                    task.getDescription(),
                    cost,
                    1
            );

            total += cost;
            items.add(newItem);
        }

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
