package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.accounting.OrderItem;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.views.order.CreateOrderView;
import com.solvd.laba.computer_repair_service.views.order.ShowOrderView;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderController{
    private static int nextOrderId;
    private static HashMap<Integer, Order> orders;
    private static CreateOrderView createOrderView;
    private static ShowOrderView showOrderView;

    static{
        nextOrderId = 0;
        orders = new HashMap<>();
        createOrderView = new CreateOrderView();
        showOrderView = new ShowOrderView();
    }

    public OrderController() {}

    public Order create(ServiceRequest request){
        createOrderView.display();

        Order newOrder;
        ArrayList<OrderItem> items = new ArrayList<>();
        ArrayList<Task> tasks = request.getTasks();
        double total = 0.0;

        for(Task task: tasks){
            double taskCost = Order.getServiceCost(task.getTypeOfTask());

            OrderItem newItem = new OrderItem(
                    task.getDescription(),
                    taskCost,
                    1
            );

            total += taskCost;
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
