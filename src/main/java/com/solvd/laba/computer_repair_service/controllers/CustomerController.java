package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.views.customer.CreateCustomerView;

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
        createCustomerView.display();
        HashMap<String, String> input = createCustomerView.getInputs();

        Customer newCustomer = new Customer(
                nextCustomerId,
                input.get("firstName"),
                input.get("lastName"),
                input.get("address"),
                input.get("email"),
                input.get("phoneNumber")
        );

        customers.add(newCustomer);
        nextCustomerId++;

        return newCustomer;
    }

    public void delete(int id){
        customers.remove(id);
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
