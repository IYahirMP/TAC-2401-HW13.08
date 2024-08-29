package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;
import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.views.order.ShowOrderView;
import com.solvd.laba.computer_repair_service.views.task.CreateTaskView;

import java.util.HashMap;

public class ServiceHandler {
    private static CustomerController customerController = new CustomerController();
    private static RequestController requestController = new RequestController();
    private static TaskController taskController = new TaskController();
    private static OrderController orderController = new OrderController();

    private static SingleInput<Integer> addMoreServices =  new IntegerInput();
    private static SingleInput<Integer> serviceIsOkay =  new IntegerInput();
    private static ServiceRequest currentRequest = null;
    private static Order currentOrder = null;

    public ServiceHandler(){
    }

    public void service(){
        receiveCustomer();
        createRequest();
        addServices();
        createOrder();
        if (!agreeService()){
            modifyOrder();
        }
        receiveComputer();
        /*assignTechnicians();*/
    }

    public void assignTechnicians(){

    }

    public void createOrder(){
        currentOrder = orderController.create(currentRequest);
        orderController.show(currentOrder.getOrder_id());
    }

    public void modifyOrder(){
        //Placeholder
        //To be implemented
        System.out.println("Order modifying not implemented. Shutting down...");
        System.exit(0);
    }

    public void receiveComputer(){

    }

    public boolean agreeService(){
        System.out.println("Is your order correct?");
        System.out.println("\t1) Yes");
        System.out.println("\t2) No");
        serviceIsOkay.accept(new RetrieveInputVisitor());
        return ((int) serviceIsOkay.getValue()) == 1;
    }

    public void addServices(){
        System.out.println("Now please let us know which services you need.");
        boolean stop = false;
        while (!stop) {
            createTask();
            System.out.println("Do you want to add more services?");
            System.out.println("\t1) Yes");
            System.out.println("\t2) No");
            addMoreServices.accept(new RetrieveInputVisitor());
            stop = ((int) addMoreServices.getValue() == 2);
        }
    }

    public void createTask(){
        Task task = taskController.create();
        currentRequest.addTask(task);
    }

    public void createRequest(){
        currentRequest = requestController.create();
    }

    public void receiveCustomer(){
        customerController.create();
    }

}