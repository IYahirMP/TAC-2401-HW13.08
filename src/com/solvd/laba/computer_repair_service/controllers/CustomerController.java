package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.views.customer.CreateCustomerView;

import java.util.HashMap;

public class CustomerController implements Controller{
    private static int nextCustomerId;
    private static HashMap<Integer, Customer> customers;
    private static CreateCustomerView createCustomerView;

    static{
        nextCustomerId = 0;
        customers = new HashMap<>();
        createCustomerView = new CreateCustomerView();
    }

    public CustomerController() {
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

        customers.put(nextCustomerId, newCustomer);
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
