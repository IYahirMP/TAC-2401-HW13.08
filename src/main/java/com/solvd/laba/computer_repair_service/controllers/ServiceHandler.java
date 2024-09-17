package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;
import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.people.Technician;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;

public class ServiceHandler {
    private static Logger logger = LogManager.getLogger(
            com.solvd.laba.computer_repair_service.controllers.ServiceHandler.class);

    private CustomerController customerController = new CustomerController();
    private RequestController requestController = new RequestController();
    private TaskController taskController = new TaskController();
    private OrderController orderController = new OrderController();
    private ComputerController computerController = new ComputerController();
    private TechnicianController technicianController = new TechnicianController();

    private SingleInput<Integer> addMoreServices =  new IntegerInput();
    private SingleInput<Integer> serviceIsOkay =  new IntegerInput();
    private ServiceRequest currentRequest = null;
    private Order currentOrder = null;
    private Computer currentComputer = null;

    public ServiceHandler(){
    }

    public void service(){
        logger.trace("About to enter receiveCustomer()");
        receiveCustomer();
        logger.trace("About to enter createRequest()");
        createRequest();
        logger.trace("About to enter addServices()");
        addServices();
        logger.trace("About to enter createOrder()");
        createOrder();
        if (!agreeService()){
            logger.trace("About to enter modifyOrder()");
            modifyOrder();
        }
        logger.trace("About to enter receiveComputer()");
        receiveComputer();
        logger.trace("About to enter assignTechnicians()");
        assignTechnicians();
        performTasks();
    }

    public void performTasks(){
        //To be implemented
        //ServiceRequest has a list of tasks
        //There is a list of technicians
        //There is a computer
        //A technician is assigned based on the computer type
        //The technician gets assigned to the tasks of the current request
        //------------------------------------------------------------------
        //The technician performs, in order, the tasks OF the current request
        requestController.performTasks(currentRequest);

    }

    public void assignTechnicians(){
        Technician technician;
        technician = technicianController.searchTechnician(currentComputer);
        if (technician == null){
            System.out.println("We are sorry, there are no technicians available right now.");
            System.exit(0);
        }

        requestController.assignTasksToTechnician(technician, currentRequest);
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
        currentComputer = computerController.create();
        System.out.println("Client's computer has been received");
        System.out.println(currentComputer);

        for(Task t: currentRequest.getTasks()){
            t.setComputer(currentComputer);
        }
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
            task.setRequest(currentRequest);
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