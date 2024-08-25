package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.accounting.OrderItem;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.model.service_management.TypeOfTask;

import java.util.ArrayList;
import java.util.HashMap;

public class OrderController {
    private int nextOrderId;
    private HashMap<Integer, Order> orders;

    public OrderController() {
        orders = new HashMap<>();
        nextOrderId = 0;
    }

    public Order createOrder(ServiceRequest request){
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

        orders.put(nextOrderId, newOrder);
        nextOrderId++;
        return newOrder;
    }

}
