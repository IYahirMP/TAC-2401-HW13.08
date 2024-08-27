package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.ComplexInput;
import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.complex_input.CustomerInput;
import com.solvd.laba.computer_repair_service.input.visitors.GetValueVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;
import com.solvd.laba.computer_repair_service.model.people.Customer;

import java.util.HashMap;

public class CustomerController {
    private int nextCustomerId;
    private HashMap<Integer, Customer> customers;

    public CustomerController() {
        this.customers = new HashMap<>();
        this.nextCustomerId = 0;
    }

    public void createCustomer(HashMap<String, SingleInput<?>> input){
        Customer newCustomer;
        GetValueVisitor getValue = new GetValueVisitor();

        newCustomer = new Customer(
                nextCustomerId,
                (String) input.get("firstName").accept(getValue),
                (String) input.get("lastName").accept(getValue),
                (String) input.get("address").accept(getValue),
                (String) input.get("email").accept(getValue),
                (String) input.get("phoneNumber").accept(getValue)
        );

        customers.put(nextCustomerId, newCustomer);
        nextCustomerId++;
    }
}
