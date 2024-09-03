package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;
import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class ServiceHandler {
    private static Logger logger = LogManager.getLogger(com.solvd.laba.computer_repair_service.controllers.ServiceHandler.class);

    private CustomerController customerController = new CustomerController();
    private RequestController requestController = new RequestController();
    private TaskController taskController = new TaskController();
    private OrderController orderController = new OrderController();

    private SingleInput<Integer> addMoreServices =  new IntegerInput();
    private SingleInput<Integer> serviceIsOkay =  new IntegerInput();
    private ServiceRequest currentRequest = null;
    private Order currentOrder = null;

    public ServiceHandler(){
    }

    public void service(){
        logger.info("About to begin receiveCustomer()");
        receiveCustomer();
        logger.info("About to begin createRequest()");
        createRequest();
        logger.info("About to begin addServices()");
        addServices();
        logger.info("About to begin createOrder()");
        createOrder();
        if (!agreeService()){
            logger.info("About to begin modifyOrder()");
            modifyOrder();
        }
        logger.info("About to begin receiveComputer()");
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
            try {
                createTask();
            }catch (Exception e){
                System.out.println("Error creating task, please try again");
                continue;
            }

            System.out.println("Do you want to add more services?");
            System.out.println("\t1) Yes");
            System.out.println("\t2) No");
            addMoreServices.accept(new RetrieveInputVisitor());
            stop = ((int) addMoreServices.getValue() == 2);
        }
    }

    public void createTask(){
        Task task = taskController.create();
        try {
            currentRequest.addTask(task);
        }catch(IllegalArgumentException e){
            System.out.println("Error creating task: " + e.getMessage());
            System.out.println("Please, try again.");
            createTask();
        }
    }

    public void createRequest(){
        currentRequest = requestController.create();
    }

    public void receiveCustomer(){
        customerController.create();
    }

}