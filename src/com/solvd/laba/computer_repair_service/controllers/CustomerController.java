package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.people.Customer;

import java.util.HashMap;

public class CustomerController {
    private int nextCustomerId;
    private HashMap<Integer, Customer> customers;

    public CustomerController() {
        this.customers = new HashMap<>();
        this.nextCustomerId = 0;
    }

    public Customer createCustomer(HashMap<String, Input<?>> inputs){
        Customer newCustomer;

        newCustomer = new Customer(
                nextCustomerId,
                (String) inputs.get("firstName").getValue(),
                (String) inputs.get("lastName").getValue(),
                (String) inputs.get("address").getValue(),
                (String) inputs.get("email").getValue(),
                (String) inputs.get("phoneNumber").getValue()
        );

        customers.put(nextCustomerId, newCustomer);
        nextCustomerId++;
        return newCustomer;
    }
}
