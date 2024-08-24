package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.views.CreateCustomerView;
import com.solvd.laba.computer_repair_service.views.CreateRequestView;

import java.util.HashMap;
import java.util.Scanner;

public class ServiceHandler {
    private CreateCustomerView createCustomerView;
    private CreateRequestView createRequestView;
    private CustomerController customerController;
    private RequestController requestController;

    public ServiceHandler(){
        createCustomerView = new CreateCustomerView();
        customerController = new CustomerController();
        requestController = new RequestController();
        createRequestView = new CreateRequestView();
    }

    public void service(){
        //receiveCustomer();
        createRequest();
        /*receiveComputer();
        createIssues();
        createOrder();
        executeRepairs();
        informResults();
        bill();*/
    }

    public void createRequest(){
        createRequestView.display();
        HashMap<String, Input<?>> requestInputs = createRequestView.getInputs();
        requestController.createRequest(requestInputs);
    }

    public void receiveCustomer(){
        createCustomerView.display();
        HashMap<String, Input<?>> customerInputs = createCustomerView.getInputs();
        customerController.createCustomer(customerInputs);
    }

    public Task showIssueCreation() {
        /*
        While client needs more issues
            show options
            get user input
            validate input and store issue or rollback
         */

        return new Task();
    }

    public void showIssueOption(){
        System.out.println("How can we help you?.");
        System.out.println("\t1) I want a diagnose");
        System.out.println("\t2) My computer needs maintenance");
        System.out.println("\t3) Screen won't work properly");
        System.out.println("\t4) Computer won't boot");
        System.out.println("\t5) Keyboard won't work properly");
        System.out.println("\t6) Mouse won't work properly");
        System.out.println("\t7) Battery doesn't last / Computer won't work without charger");
        System.out.println("\t8) Computer heats up too much");
        System.out.println("\t9) Computer makes strange sound");
    }
}