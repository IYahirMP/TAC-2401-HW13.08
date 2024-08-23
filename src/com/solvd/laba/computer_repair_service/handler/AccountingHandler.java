package com.solvd.laba.computer_repair_service.handler;

import com.solvd.laba.computer_repair_service.accounting.*;
import com.solvd.laba.computer_repair_service.people.Customer;
import com.solvd.laba.computer_repair_service.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.service_management.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class AccountingHandler {
    final private HashMap<Integer, Order> orders;
    final private ArrayList<Invoice> invoices;
    final private ArrayList<Payment> payments;
    private int lastOrderId;
    private int lastInvoiceId;
    private int lastPaymentId;

    public AccountingHandler() {
        orders = new HashMap<>();
        invoices = new ArrayList<>();
        payments = new ArrayList<>();
        lastOrderId = 0;
        lastInvoiceId = 0;
        lastPaymentId = 0;
    }

    /** Main Logic */

    protected Order createOrder(ServiceRequest request){
        Order newOrder;
        ArrayList<OrderItem> items = new ArrayList<>();
        ArrayList<Task> tasks = request.getTasks();
        double total = 0.0;

        for(Task task: tasks){
            OrderItem newItem = new OrderItem(
              task.getDescription(),
              task.getCost(),
              1
            );

            total += task.getCost();
            items.add(newItem);
        }

        newOrder = new Order(
                lastOrderId + 1,
                total,
                Order.OrderState.ONGOING,
                items
        );

        orders.put(lastOrderId + 1, newOrder);
        lastOrderId++;
        return newOrder;
    }

    protected Invoice createInvoice(Order order){
        Invoice newInvoice = new Invoice(
                lastInvoiceId + 1,
                LocalDate.now(),
                order.getTotal()
        );

        lastInvoiceId++;
        invoices.add(newInvoice);
        return newInvoice;
    }

    protected Payment registerPayment(Customer customer, Invoice invoice){
        Payment newPayment = new Payment(
                lastPaymentId + 1,
                invoice.getTotalAmount(),
                LocalDate.now(),
                Payment.PaymentMethod.CASH
        );

        lastPaymentId++;
        payments.add(newPayment);
        customer.addPayment(newPayment);
        return newPayment;
    }

    protected void breakdownOrder(int orderId){
        Order order = orders.get(orderId);

        System.out.println("Breakdown of order No. " + orderId);
        for(OrderItem item: order.getItems()){
            System.out.println(item);
        }
    }

    /** Getters and setters */

    public HashMap<Integer, Order> getOrders() {
        return orders;
    }

    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public ArrayList<Payment> getPayments() {
        return payments;
    }

    public int getLastOrderId() {
        return lastOrderId;
    }

    public void setLastOrderId(int lastOrderId) {
        this.lastOrderId = lastOrderId;
    }

    public int getLastInvoiceId() {
        return lastInvoiceId;
    }

    public void setLastInvoiceId(int lastInvoiceId) {
        this.lastInvoiceId = lastInvoiceId;
    }

    public int getLastPaymentId() {
        return lastPaymentId;
    }

    public void setLastPaymentId(int lastPaymentId) {
        this.lastPaymentId = lastPaymentId;
    }
}
