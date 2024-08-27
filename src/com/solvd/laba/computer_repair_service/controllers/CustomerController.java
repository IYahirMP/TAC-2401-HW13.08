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
    private static int nextCustomerId;
    private static HashMap<Integer, Customer> customers;

    static{
        nextCustomerId = 0;
        customers = new HashMap<>();
    }

    public CustomerController() {
    }

    public void createCustomer(HashMap<String, String> input){
        Customer newCustomer;
        GetValueVisitor getValue = new GetValueVisitor();

        newCustomer = new Customer(
                nextCustomerId,
                input.get("firstName"),
                input.get("lastName"),
                input.get("address"),
                input.get("email"),
                input.get("phoneNumber")
        );

        customers.put(nextCustomerId, newCustomer);
        nextCustomerId++;
    }
}
