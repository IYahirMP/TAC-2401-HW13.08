package com.solvd.laba.computer_repair_service.controllers.deprecated;

import com.solvd.laba.computer_repair_service.model.accounting.*;
import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.function.Consumer;

public class AccountingHandler {
    private HashMap<Integer, Order> orders;
    private ArrayList<Invoice> invoices;
    private ArrayList<Payment> payments;
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

    public void breakdownOrder(int orderId){
        Order order = orders.get(orderId);


        System.out.println("Breakdown of order No. " + orderId);

        Consumer<OrderItem> printOrderItem = item -> System.out.println(item);
        for(OrderItem item: order.getItems()){
            printOrderItem.accept(item);
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
