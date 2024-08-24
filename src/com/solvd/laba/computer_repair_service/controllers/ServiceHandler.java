package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.views.CreateCustomerView;
import com.solvd.laba.computer_repair_service.views.CreateRequestView;
import com.solvd.laba.computer_repair_service.views.CreateTaskView;

import java.util.HashMap;
import java.util.Scanner;

public class ServiceHandler {
    private CreateCustomerView createCustomerView;
    private CreateRequestView createRequestView;
    private CreateTaskView createTaskView;
    private CustomerController customerController;
    private RequestController requestController;
    private TaskController taskController;

    public ServiceHandler(){
        createCustomerView = new CreateCustomerView();
        customerController = new CustomerController();
        requestController = new RequestController();
        createRequestView = new CreateRequestView();
        taskController = new TaskController();
        createTaskView = new CreateTaskView();
    }

    public void service(){
        //receiveCustomer();
        //createRequest();
        createTask();

        /*receiveComputer();
        createIssues();
        createOrder();
        executeRepairs();
        informResults();
        bill();*/
    }

    public void createTask(){
        createTaskView.display();
        HashMap<String, Input<?>> inputs = createTaskView.getInputs();
        taskController.createTask(inputs);
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

}