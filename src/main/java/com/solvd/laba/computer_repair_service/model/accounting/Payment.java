package com.solvd.laba.computer_repair_service.model.accounting;
import java.time.LocalDate;

/**
 * The class Payment represents a payment made by a customer, including its ID, amount,
 * date, and payment method. The class provides methods to
 * manage a payment's data, including the payment id, amount paid,
 * date and payment method.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Payment {
    /** Payment methods list */
    public enum PaymentMethod {CREDIT_CARD, DEBIT_CARD, CASH, BANK_TRANSFER}

    /** Holds the id for the payment */
    private int paymentId;

    /** Holds the total amount paid */
    private double amount;

    /** Holds the date when the payment was made. */
    private LocalDate paymentDate;

    /** Holds the method used for the payment (cash, credit card, etc.). */
    private PaymentMethod paymentMethod;


    /**
     * Default constructor for Payment.
     * Defaults the payment id to -1, amount to 0.0, date to current date,
     * and payment method to an empty string.
     */
    public Payment() {
        paymentId = -1;
        amount = 0.0;
        paymentDate = LocalDate.now();
        paymentMethod = PaymentMethod.CASH;
    }

    /**
     * Constructor to create a Payment with specified values.
     *
     * @param paymentId   The payment ID.
     * @param amount      The amount paid.
     * @param paymentDate The date of the payment.
     * @param paymentMethod The payment method used.
     */
    public Payment(int paymentId, double amount, LocalDate paymentDate, PaymentMethod paymentMethod) {
        this.paymentId = paymentId;
        this.amount = amount;
        this.paymentDate = paymentDate;
        this.paymentMethod = paymentMethod;
    }

    /**
     * Retrieves the payment id
     * @return The payment id.
     */
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * Sets the payment ID.
     * @param paymentId The new payment ID.
     */
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * Retrieves the total amount paid in this payment.
     * @return The amount paid.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Sets the total amount paid in this payment.
     * @param amount The new amount paid.
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Retrieves the date when the payment was made.
     * @return The date of the payment.
     */
    public LocalDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the date when the payment was made.
     * @param paymentDate The new date of the payment.
     */
    public void setPaymentDate(LocalDate paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Retrieves the payment method used (e.g., cash, credit card, etc.).
     * @return The payment method.
     */
    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the payment method used (e.g., cash, credit card, etc.).
     * @param paymentMethod The new payment method.
     */
    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Payment Id: " + paymentId).
                append("Amount: " + amount).
                append("Payment Date: " + paymentDate).
                append("Payment Method: " + paymentMethod);
        return sb.toString();
    }
}
