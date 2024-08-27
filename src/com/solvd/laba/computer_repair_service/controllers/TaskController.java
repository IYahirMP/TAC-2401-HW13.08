package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceStatus;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.model.service_management.TypeOfTask;

import java.util.HashMap;

public class TaskController {
    private int nextTaskId;
    private HashMap<Integer, Task> tasks;

    public TaskController() {
        tasks = new HashMap<>();
        nextTaskId = 0;
    }

    public Task createTask(HashMap<String, String> inputs){
        int choice = Integer.parseInt(inputs.get("choice"));
        TypeOfTask type = switch (choice) {
            case 1 -> TypeOfTask.DIAGNOSE;
            case 2 -> TypeOfTask.MAINTENANCE;
            case 3 -> TypeOfTask.FIX_NO_SCREEN;
            case 4 -> TypeOfTask.FIX_NO_BOOT;
            case 5 -> TypeOfTask.FIX_BAD_KEYBOARD;
            case 6 -> TypeOfTask.FIX_BAD_MOUSE;
            case 7 -> TypeOfTask.FIX_BAD_BATTERY;
            case 8 -> TypeOfTask.FIX_OVERHEAT;
            case 9 -> TypeOfTask.FIX_STRANGE_SOUND;
            default -> {throw new IllegalArgumentException("Invalid option");}
        };

        Task task = new Task(
                nextTaskId,
                ServiceStatus.PENDING,
                type
        );

        tasks.put(nextTaskId, task);
        nextTaskId++;

        return task;
    }
}
