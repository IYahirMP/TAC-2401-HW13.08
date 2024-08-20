package com.solvd.laba.computer_repair_service.people;
/**
 * The class Customer represents a customer of the computer repair service.
 * It holds information such as the customer's id, first and last name, address,
 * email, and phone number. This class provides methods to create and manage customer data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Customer extends Person{

    /** Holds the customer id. */
    private int customerId;

    /**
     * Default constructor for Customer.
     * Initializes customerId to 0, firstName, lastName, address, email,
     * and phoneNumber to empty strings.
     */
    Customer() {
        super();
        this.customerId = 0;
    }

    /**
     * Constructs a Customer with specified values for all attributes.
     * @param customerId The unique identifier for the customer.
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     * @param address The address of the customer.
     * @param email The email address of the customer.
     * @param phoneNumber The phone number of the customer.
     */
    Customer(int customerId, String firstName, String lastName,
             String address, String email, String phoneNumber) {
        super(firstName, lastName, address, email, phoneNumber);
        this.customerId = customerId;
    }

    /**
     * Constructs a Customer with specified values for id, first name, and last name.
     * Address, email, and phone number are initialized to empty strings.
     * @param customerId The unique identifier for the customer.
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     */
    Customer(int customerId, String firstName, String lastName) {
        super(firstName, lastName);
        this.customerId = customerId;
    }

    /**
     * Retrieves the unique identifier of the customer.
     * @return The customerId of the Customer.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Sets the unique identifier for the customer.
     * @param customerId The unique identifier to set for the Customer.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Customer ID: " + customerId;
        return result;
    }
}
