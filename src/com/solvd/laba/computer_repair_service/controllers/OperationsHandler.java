package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.model.service_management.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class OperationsHandler {
    private int nextTaskId;
    private Scanner input;
    private HashMap<Integer, Task> tasks;

    public OperationsHandler() {
        tasks = new HashMap<>();
        nextTaskId = 0;
    }

    // Main logic starts here

    /*protected ServiceRequest createRequest(Customer customer) {

        ServiceRequest newRequest = new ServiceRequest();

        while (true) {
            Task newTask = new Task();
            boolean requestHasTask = newRequest.hasTask(newTask.getTypeOfTask());

            if (requestHasTask){
                System.out.println("You have already asked for that task. Please select another.");
                continue;
            }

            requestTasks.add(newTask);
            tasks.put(nextTaskId, newTask);
            nextTaskId++;

            System.out.println("Do you want to finish?"
                    + "\n\t 1) Yes"
                    + "\n\t 2) No"
            );
            toFinish = (input.nextInt() == 1);

            if (toFinish) {
                break;
            }
        }

        newRequest.setTasks(requestTasks);
        newRequest.updateDescription();
        nextRequestId++;
        return newRequest;
    }*/

    protected Task createIssue(int faultChoice){
        Task newTask;

        switch (faultChoice) {
            case 1 -> {newTask = createTask(TypeOfTask.DIAGNOSE);}
            case 2 -> {newTask = createTask(TypeOfTask.MAINTENANCE);}
            case 3 -> {newTask = createTask(TypeOfTask.FIX_NO_SCREEN);}
            case 4 -> {newTask = createTask(TypeOfTask.FIX_NO_BOOT);}
            case 5 -> {newTask = createTask(TypeOfTask.FIX_BAD_KEYBOARD);}
            case 6 -> {newTask = createTask(TypeOfTask.FIX_BAD_MOUSE);}
            case 7 -> {newTask = createTask(TypeOfTask.FIX_BAD_BATTERY);}
            case 8 -> {newTask = createTask(TypeOfTask.FIX_OVERHEAT);}
            case 9 -> {newTask = createTask(TypeOfTask.FIX_STRANGE_SOUND);}
            default -> {throw new IllegalArgumentException("Invalid option");}
        }

        return newTask;
    }

    protected Task createTask(TypeOfTask type) {
        int taskId = nextTaskId;
        ServiceStatus status = ServiceStatus.PENDING;

        Task newTask = new Task(taskId, status, type);
        nextTaskId++;
        return newTask;
    }

    // Getters and setters start here.


}
