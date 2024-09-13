package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.model.people.Technician;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceStatus;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.views.request.CreateRequestView;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class RequestController {
    private int nextRequestId;
    private LinkedList<ServiceRequest> requests;
    private CreateRequestView createRequestView;

    public RequestController() {
        requests = new LinkedList<>();
        nextRequestId = 0;
        createRequestView = new CreateRequestView();
    }

    public ServiceRequest create() {
        createRequestView.display();

        try{
            HashMap<String, String> inputs = createRequestView.getInputs();

            ServiceRequest newRequest = new ServiceRequest(
                    nextRequestId,
                    LocalDate.now(),
                    ServiceStatus.ONGOING,
                    inputs.get("Description")
            );

            requests.add(newRequest);
            nextRequestId++;
            return newRequest;

        } catch(Exception E){
            E.printStackTrace();
            return null;
        }
    }

    public void performTasks(ServiceRequest request){
        LinkedList<Task> tasks = request.getTasks();
        Supplier<Technician> assignedTechnician = () -> tasks.get(0).getAssignedTechnician();

        Technician technician = assignedTechnician.get();
        Supplier<Task> nextTask = technician::getNextTask;

        for(int i = 0; i < tasks.size(); i++){
            Task task = nextTask.get();
            int taskRequestId = task.getRequest().getRequestId();

            if (taskRequestId == request.getRequestId()){
                technician.performNextTask();
                continue;
            }

            break;
        }
    }

    public void assignTasksToTechnician(Technician technician, ServiceRequest request){
        LinkedList<Task> tasks = request.getTasks();

        System.out.println("Assigned technician is: " + technician.getFirstName());
        System.out.println(technician);
        tasks.forEach(
                t -> {
                    t.setAssignedTechnician(technician);
                    technician.addTask(t);
                    System.out.println(technician.getFirstName() + " is now in charge of task no. " + t.getTaskId());
                });
    }

    public ServiceRequest find(int id) {
        return requests.get(id);
    }

    public void show(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(int id) {
        requests.remove(id);
    }

    public void update(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}