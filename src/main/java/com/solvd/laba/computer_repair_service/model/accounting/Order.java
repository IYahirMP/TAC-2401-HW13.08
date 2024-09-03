package com.solvd.laba.computer_repair_service.model.accounting;

import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.model.service_management.TypeOfTask;

import java.util.ArrayList;

public class Order {
    public enum OrderState {PENDING, ONGOING, COMPLETED, CANCELED, ON_HOLD}
    private int order_id;
    private double total;
    private OrderState state;
    private LinkedList<OrderItem> items;
    private Invoice invoice;

    public Order(int order_id, double total, OrderState state) {
        this.order_id = order_id;
        this.total = total;
        this.state = state;
        this.items = new LinkedList<>();
        this.invoice = new Invoice();
    }

    public Order(int order_id, double total, OrderState state, LinkedList<OrderItem> items) {
        this.order_id = order_id;
        this.total = total;
        this.state = state;
        this.items = items;
        this.invoice = new Invoice();
    }

    public Order(int order_id, double total, OrderState state, LinkedList<OrderItem> items, Invoice invoice) {
        this.order_id = order_id;
        this.total = total;
        this.state = state;
        this.items = items;
        this.invoice = invoice;
    }

    public static double getServiceCost(TypeOfTask service){
        double cost = 0.0;
        cost = switch (service) {
            case TypeOfTask.DIAGNOSE -> 100;
            case TypeOfTask.MAINTENANCE -> 200;
            case TypeOfTask.FIX_NO_SCREEN -> 200;
            case TypeOfTask.FIX_NO_BOOT -> 200;
            case TypeOfTask.FIX_BAD_KEYBOARD -> 100;
            case TypeOfTask.FIX_BAD_MOUSE -> 100;
            case TypeOfTask.FIX_BAD_BATTERY -> 100;
            case TypeOfTask.FIX_OVERHEAT -> 200;
            case TypeOfTask.FIX_STRANGE_SOUND -> 200;
            default -> {throw new IllegalArgumentException("Invalid option");}
        };

        return cost;
    }

    public int getOrder_id() {
        return order_id;
    }

    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public LinkedList<OrderItem> getItems() {
        return items;
    }

    public void setItems(LinkedList<OrderItem> items) {
        this.items = items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: " + order_id + "\n");
        sb.append("Total Cost: " + total + "\n");
        sb.append("State: " + state + "\n");
        sb.append("Items:\n");
        for (int i = 0; i < items.size(); i++) {
            sb.append("---------------------------------------------\n");
            sb.append("Task number " + i + "\n");
            sb.append("---------------------------------------------\n");
            sb.append(items.get(i).toString() + "\n");
        }

        return sb.toString();
    }
}
