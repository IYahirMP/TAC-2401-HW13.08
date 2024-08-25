package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.IntegerInput;
import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.views.*;

import java.security.Provider;
import java.util.HashMap;
import java.util.Scanner;

public class ServiceHandler {
    private CreateCustomerView createCustomerView;
    private CreateRequestView createRequestView;
    private CreateTaskView createTaskView;
    private CustomerController customerController;
    private RequestController requestController;
    private TaskController taskController;
    private Input<Integer> addMoreServices;
    private CreateOrderView createOrderView;
    private OrderController orderController;
    private ShowOrderDetailsView showOrderDetailsView;

    private ServiceRequest currentRequest;
    private Order currentOrder;

    public ServiceHandler(){
        createCustomerView = new CreateCustomerView();
        customerController = new CustomerController();
        requestController = new RequestController();
        createOrderView = new CreateOrderView();
        taskController = new TaskController();
        createTaskView = new CreateTaskView();
        addMoreServices = new IntegerInput();
        createRequestView = new CreateRequestView();
        orderController = new OrderController();
        showOrderDetailsView = new ShowOrderDetailsView();
        currentRequest = new ServiceRequest();
    }

    public void service(){
        receiveCustomer();
        createRequest();
        addServices();
        createOrder();
    }

    /*receiveComputer();
        createOrder();
        executeRepairs();
        informResults();
        bill();*/

    public void createOrder(){
        createOrderView.display();
        currentOrder = orderController.createOrder(currentRequest);
        System.out.println("Order created successfully");

        HashMap<String, Object> inputs = new HashMap<>();
        inputs.put("order", currentOrder);

        showOrderDetailsView.setInputs(inputs);
        showOrderDetailsView.display();
    }

    public void addServices(){
        System.out.println("Now please let us know which services you need.");
        boolean stop = false;
        while (!stop) {
            createTask();
            System.out.println("Do you want to add more services?");
            System.out.println("\t1) Yes");
            System.out.println("\t2) No");
            addMoreServices.retrieveInput();
            stop = ((int) addMoreServices.getValue() == 2);
        }
    }

    public void createTask(){
        createTaskView.display();
        HashMap<String, Input<?>> inputs = createTaskView.getInputs();
        Task task = taskController.createTask(inputs);
        currentRequest.addTask(task);
    }

    public void createRequest(){
        createRequestView.display();
        HashMap<String, Input<?>> requestInputs = createRequestView.getInputs();
        currentRequest = requestController.createRequest(requestInputs);
    }

    public void receiveCustomer(){
        createCustomerView.display();
        HashMap<String, Input<?>> customerInputs = createCustomerView.getInputs();
        customerController.createCustomer(customerInputs);
    }

}