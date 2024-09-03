package com.solvd.laba.computer_repair_service.model.accounting;

import com.solvd.laba.computer_repair_service.model.people.Customer;

import java.time.LocalDate;

/**
 * Represents an invoice with details about the invoice ID, issue date,
 * total amount, and client name. The class provides methods to
 * manage the invoice's data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Invoice {

    /**
     * Unique identifier for the invoice.
     */
    private int invoiceId;

    /**
     * Date when the invoice was issued.
     */
    private LocalDate issueDate;

    /**
     * Total amount of the invoice.
     */
    private double totalAmount;

    private Payment payment;

    /**
     * Default constructor for Invoice.
     * Defaults invoiceId to -1, issueDate to today's date,
     * totalAmount to 0.0 and clientName to an empty string.
     */
    public Invoice() {
        invoiceId = -1;
        issueDate = LocalDate.now();
        totalAmount = 0.0;
        payment = null;
    }

    /**
     * Constructor to create an Invoice with the specified values, with no payment.
     *
     * @param invoiceId   The invoice ID.
     * @param issueDate   The issue date.
     * @param totalAmount The total amount of the invoice.
     */
    public Invoice(int invoiceId, LocalDate issueDate, double totalAmount) {
        this.invoiceId = invoiceId;
        this.issueDate = issueDate;
        this.totalAmount = totalAmount;
        this.payment = null;
    }

    /**
     * Constructor to create an Invoice with the specified values.
     *
     * @param invoiceId   The invoice ID.
     * @param issueDate   The issue date.
     * @param totalAmount The total amount of the invoice.
     * @param payment  The payment's reference.
     */
    public Invoice(int invoiceId, LocalDate issueDate, double totalAmount, Payment payment) {
        this.invoiceId = invoiceId;
        this.issueDate = issueDate;
        this.totalAmount = totalAmount;
        this.payment = payment;
    }

    /**
     * Retrieves the invoice ID.
     *
     * @return The invoice ID.
     */
    public int getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the invoice ID.
     *
     * @param invoiceId The new invoice ID.
     */
    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Retrieves the issue date of the invoice.
     *
     * @return The issue date.
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the issue date of the invoice.
     *
     * @param issueDate The new issue date.
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Retrieves the total amount of the invoice.
     *
     * @return The total amount.
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the total amount of the invoice.
     *
     * @param totalAmount The new total amount.
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Invoice ID: " + invoiceId).
            append("Issue Date: " + issueDate).
            append("Total Amount: " + totalAmount);

        return sb.toString();
    }
}
