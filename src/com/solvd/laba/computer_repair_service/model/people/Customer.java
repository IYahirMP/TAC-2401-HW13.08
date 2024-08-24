package com.solvd.laba.computer_repair_service.model.people;

import com.solvd.laba.computer_repair_service.model.accounting.Payment;
import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;

import java.util.ArrayList;

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

    /** Holds the customer's associated computer */
    private ArrayList<Computer> computer;

    /** Holds the customer's associated computer */
    private ArrayList<Payment> payments;

    /** Holds an array of requests */
    private ArrayList<ServiceRequest> serviceRequests;

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
    public Customer(int customerId, String firstName, String lastName,
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
    public Customer(int customerId, String firstName, String lastName) {
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

    public ArrayList<Computer> getComputer() {
        return computer;
    }

    public void setComputer(ArrayList<Computer> computer) {
        this.computer = computer;
    }

    public void addComputer(Computer computer) {
        this.computer.add(computer);
    }

    public void removeComputer(Computer computer) {
        this.computer.remove(computer);
    }

    /**
     * Retrieves the list of payments the customer has made to the Computer Repair Service
     * @return  The list of payments made
     */
    public ArrayList<Payment> getPayments() {
        return payments;
    }

    /**
     * Sets the list of payments the customer has made to the Computer Repair Service
     * @param payments The list of payments made
     */
    public void setPayments(ArrayList<Payment> payments) {
        this.payments = payments;
    }

    /**
     * Adds a new payment to the payments list
     * @param payment The new payment
     */
    public void addPayment(Payment payment) {
        this.payments.add(payment);
    }

    /**
     * Removes a payment from the payments list
     * @param payment
     */
    public void removePayment(Payment payment) {
        this.payments.remove(payment);
    }

    public ArrayList<ServiceRequest> getServiceRequests() {
        return serviceRequests;
    }

    public void setServiceRequests(ArrayList<ServiceRequest> serviceRequests) {
        this.serviceRequests = serviceRequests;
    }

    public void addServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequests.add(serviceRequest);
    }

    public void removeServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequests.remove(serviceRequest);
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Customer ID: " + customerId + "\n";
        return result;
    }
}
