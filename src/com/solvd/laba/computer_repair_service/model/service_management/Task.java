package com.solvd.laba.computer_repair_service.model.service_management;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.ComputerProduct;

import java.util.ArrayList;

/**
 * The ServiceTask class represents an individual task that is performed within
 * the scope of a service request. Many services may be performed within the same
 * service requests.
 * This class provides methods to manage task data such as the taskId, description,
 * status, priority and cost.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Task implements Comparable<Task>{

    /** Holds the id for the task.*/
    private int taskId;

    /** Holds a description of the task.*/
    private String description;

    /** Holds the status of the task, whether it has been completed, is pending or in hold*/
    private ServiceStatus status;

    /** Holds the priority of the task. Higher values mean higher priority*/
    private int priority;

    private TypeOfTask typeOfTask;

    private ArrayList<ComputerProduct> products;

    private Computer computer;

    /**
     * Default constructor for ServiceTask.
     * Defaults taskId to -1, description and status to empty strings,
     * priority to 0, and cost to 0.0.
     * */
    public Task() {
        this.taskId = -1;
        this.description = "";
        this.status = ServiceStatus.PENDING;
        this.priority = 0;
        this.typeOfTask = TypeOfTask.DIAGNOSE;
        this.computer = new Computer();
    }

    /**
     * Creates a ServiceTask with the given taskId, description, status, priority and cost.
     * @param taskId The id for the task.
     * @param status The status of the task.
     * @param type The kind of task
     */
    public Task(int taskId, ServiceStatus status, TypeOfTask type) {
        this.taskId = taskId;
        this.status = status;
        this.typeOfTask = type;
        updateDescription();
        updatePriority();
    }

    /**
     * Creates a task with an id, description and cost.
     * It defaults priority and status to 0 and PENDING, respectively.
     * @param taskId The task id
     * @param type The kind of task
     */
    public Task(int taskId, TypeOfTask type) {

        this.taskId = taskId;
        this.status = ServiceStatus.PENDING;
        this.typeOfTask = type;

        updateDescription();
        updatePriority();
    }

    public void updateDescription(){
        this.description = switch (typeOfTask) {
            case MAINTENANCE -> "Preventive maintenance";
            case DIAGNOSE -> "Diagnose device";
            case REPAIR -> "Repair device";
            case FIX_NO_SCREEN -> "Screen doesn't work.";
            case FIX_NO_BOOT -> "Computer doesn't boot up.";
            case FIX_BAD_KEYBOARD -> "Keyboard is working incorrectly or not working at all.";
            case FIX_BAD_MOUSE -> "Mouse is working incorrectly or not working at all.";
            case FIX_OVERHEAT -> "Computer is producing heating more than usual";
            case FIX_BAD_BATTERY -> "Battery life is too short.";
            case FIX_STRANGE_SOUND -> "Computer produces strange sounds";
            default -> throw new IllegalArgumentException("Invalid task type");
        };
    }

    public void updatePriority(){
        // Diagnose is first: lv 3
        // High risk are lv 2
        // Functional issues are lv 1
        // Perihperals and others are lv 0
        this.priority = switch (typeOfTask) {
            case DIAGNOSE -> 3;
            case FIX_OVERHEAT,
                 FIX_STRANGE_SOUND -> 2;
            case FIX_NO_SCREEN,
                 FIX_NO_BOOT,
                 FIX_BAD_BATTERY -> 1;
            case FIX_BAD_KEYBOARD,
                 FIX_BAD_MOUSE,
                 MAINTENANCE,
                 REPAIR -> 0;
            default -> throw new IllegalArgumentException("Invalid task type");
        };
    }

    /**
     * Retrieves the id for the task.
     * @return The task id.
     */
    public int getTaskId() {
        return this.taskId;
    }

    /**
     * Sets the taskId to the given id.
     * @param taskId The new id for the task.
     */
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    /**
     * Retrieves the description of the task.
     * @return A brief description of the task.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the description of the task to the given one.
     * @param description The new description of the task.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the status of the task.
     * @return The status of the task.
     */
    public ServiceStatus getStatus() {
        return this.status;
    }

    /**
     * Sets the status of the task to a new one.
     * @param status The new status of the task.
     */
    public void setStatus(ServiceStatus status) {
        this.status = status;
    }

    /**
     * Retrieves the priority of the task.
     * @return The priority of the task.
     */
    public int getPriority() {
        return this.priority;
    }

    /**
     * Sets the priority of the task to a new one.
     * @param priority The new priority of the task.
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    public ArrayList<ComputerProduct> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<ComputerProduct> products) {
        this.products = products;
    }

    public TypeOfTask getTypeOfTask() {
        return typeOfTask;
    }

    public void setTypeOfTask(TypeOfTask typeOfTask) {
        this.typeOfTask = typeOfTask;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nTask ID: " + this.taskId);
        sb.append("\nDescription: " + this.description);
        sb.append("\nStatus: " + this.status);
        sb.append("\nPriority: " + this.priority);
        //.append("\n------------------------------------");

        return sb.toString();
    }

    @Override
    public int compareTo(Task task) {
        //Highest priority comes first
        return -Integer.compare(this.priority, task.priority);
        }

}