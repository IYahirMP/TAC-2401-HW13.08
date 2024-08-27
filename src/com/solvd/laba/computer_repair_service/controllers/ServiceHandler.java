package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;
import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.views.*;

import java.util.HashMap;

public class ServiceHandler {
    private CreateCustomerView createCustomerView;
    private CreateRequestView createRequestView;
    private CreateTaskView createTaskView;
    private CustomerController customerController;
    private RequestController requestController;
    private TaskController taskController;
    private CreateOrderView createOrderView;
    private OrderController orderController;
    private ShowOrderDetailsView showOrderDetailsView;

    private SingleInput<Integer> addMoreServices;
    private SingleInput<Integer> serviceIsOkay;
    private ServiceRequest currentRequest;
    private Order currentOrder;

    public ServiceHandler(){
        createCustomerView = new CreateCustomerView();
        customerController = new CustomerController();
        requestController = new RequestController();
        createOrderView = new CreateOrderView();
        taskController = new TaskController();
        createTaskView = new CreateTaskView();
        createRequestView = new CreateRequestView();
        orderController = new OrderController();
        showOrderDetailsView = new ShowOrderDetailsView();
        currentRequest = new ServiceRequest();

        addMoreServices = new IntegerInput();
        serviceIsOkay = new IntegerInput();
    }

    public void service(){
        receiveCustomer();
        createRequest();
        addServices();
        createOrder();
        if (!agreeService()){
            modifyOrder();
        }
        /*receiveComputer();
        assignTechnicians();*/
    }

    /*receiveComputer();
        createOrder();
        executeRepairs();
        informResults();
        bill();*/

    public void assignTechnicians(){

    }

    public void createOrder(){
        createOrderView.display();
        currentOrder = orderController.createOrder(currentRequest);
        System.out.println("Order created successfully");

        HashMap<String, Object> inputs = new HashMap<>();
        inputs.put("order", currentOrder);

        showOrderDetailsView.setInputs(inputs);
        showOrderDetailsView.display();
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
        createTaskView.display();
        HashMap<String, SingleInput<?>> inputs = createTaskView.getInputs();
        Task task = taskController.createTask(inputs);
        currentRequest.addTask(task);
    }

    public void createRequest(){
        createRequestView.display();
        HashMap<String, SingleInput<?>> requestInputs = createRequestView.getInputs();
        currentRequest = requestController.createRequest(requestInputs);
    }

    public void receiveCustomer(){
        createCustomerView.display();
        HashMap<String, SingleInput<?>> customerInputs = createCustomerView.getInputs();
        customerController.createCustomer(customerInputs);
    }

}