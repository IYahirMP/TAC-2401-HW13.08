package com.solvd.laba.computer_repair_service.model.accounting;

import com.solvd.laba.computer_repair_service.model.people.Customer;

import java.util.ArrayList;

public class Order {
    public enum OrderState {PENDING, ONGOING, COMPLETED, CANCELED, ON_HOLD}
    private int order_id;
    private double total;
    private OrderState state;
    private ArrayList<OrderItem> items;
    private Invoice invoice;

    public Order(int order_id, double total, OrderState state) {
        this.order_id = order_id;
        this.total = total;
        this.state = state;
        this.items = new ArrayList<>();
        this.invoice = new Invoice();
    }

    public Order(int order_id, double total, OrderState state, ArrayList<OrderItem> items) {
        this.order_id = order_id;
        this.total = total;
        this.state = state;
        this.items = items;
        this.invoice = new Invoice();
    }

    public Order(int order_id, double total, OrderState state, ArrayList<OrderItem> items, Invoice invoice) {
        this.order_id = order_id;
        this.total = total;
        this.state = state;
        this.items = items;
        this.invoice = invoice;
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

    public ArrayList<OrderItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<OrderItem> items) {
        this.items = items;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }
}
