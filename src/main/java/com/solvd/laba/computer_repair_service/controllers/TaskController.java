package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.service_management.ServiceStatus;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.model.service_management.TypeOfTask;
import com.solvd.laba.computer_repair_service.views.task.CreateTaskView;

import java.util.HashMap;

public class TaskController {
    private static int nextTaskId;
    private static HashMap<Integer, Task> tasks;
    private CreateTaskView createTaskView;

    static{
        tasks = new HashMap<>();
        nextTaskId = 0;
    }

    public TaskController() {
    }

    public Task create(){
        createTaskView = new CreateTaskView();
        createTaskView.display();
        HashMap<String, String> inputs = createTaskView.getInputs();

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
