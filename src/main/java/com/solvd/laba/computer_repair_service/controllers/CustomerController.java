package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.Main;
import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.views.customer.CreateCustomerView;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.util.HashMap;

public class CustomerController {
    private int nextCustomerId;
    private LinkedList<Customer> customers;
    private CreateCustomerView createCustomerView;

    public CustomerController() {
        nextCustomerId = 0;
        customers = new LinkedList<>();
        createCustomerView = new CreateCustomerView();
    }

    public Customer create(){
        Main.logger.traceEntry();

        Main.logger.trace("Displaying customer view");
        createCustomerView.display();

        Main.logger.trace("Attempting to retrieve inputs.");
        HashMap<String, String> input = createCustomerView.getInputs();

        Main.logger.trace("Attempting to create new Customer object");
        Customer newCustomer = new Customer(
                nextCustomerId,
                input.get("firstName"),
                input.get("lastName"),
                input.get("address"),
                input.get("email"),
                input.get("phoneNumber")
        );
        Main.logger.trace("New customer has been created");

        customers.add(newCustomer);
        Main.logger.trace("Customer added to customers list");
        nextCustomerId++;
        Main.logger.trace("Next customer id is {}", nextCustomerId);

        return Main.logger.traceExit(newCustomer);
    }

    public void delete(int id){
        Main.logger.traceEntry();
        customers.remove(id);
        Main.logger.traceExit("customer with id {} has been removed from customer list", id);
    }

    public void update(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void show(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Customer find(int id){
        return customers.get(id);
    }
}
