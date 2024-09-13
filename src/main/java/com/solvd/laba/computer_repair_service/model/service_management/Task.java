package com.solvd.laba.computer_repair_service.model.service_management;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.ComputerProduct;
import com.solvd.laba.computer_repair_service.model.people.Technician;

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

    /** Holds the status of the task, whether it has been completed, is pending or in hold*/
    private ServiceStatus status;

    private ServiceRequest request;

    private TypeOfTask typeOfTask;

    private Technician assignedTechnician;

    private ArrayList<ComputerProduct> products;

    private Computer computer;

    /**
     * Default constructor for ServiceTask.
     * Defaults taskId to -1, description and status to empty strings,
     * priority to 0, and cost to 0.0.
     * */
    public Task() {
        this.taskId = -1;
        this.status = ServiceStatus.PENDING;
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
        return this.typeOfTask.getDescription();
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
        return this.typeOfTask.getPriority();
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

    public Technician getAssignedTechnician() {
        return assignedTechnician;
    }

    public void setAssignedTechnician(Technician assignedTechnician) {
        this.assignedTechnician = assignedTechnician;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public ServiceRequest getRequest() {
        return request;
    }

    public void setRequest(ServiceRequest request) {
        this.request = request;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("\nTask ID: " + this.taskId);
        sb.append("\nDescription: " + this.typeOfTask.getDescription());
        sb.append("\nStatus: " + this.status);
        sb.append("\nPriority: " + this.typeOfTask.getPriority());
        //.append("\n------------------------------------");

        return sb.toString();
    }

    @Override
    public int compareTo(Task task) {

        if (task == null){
            throw new NullPointerException("Can't compare null tasks");
        }
        //Highest priority comes first

        boolean isOlderRequest = this.request.getRequestId() < task.getRequest().getRequestId();
        boolean isSameRequest = this.request.getRequestId() == task.getRequest().getRequestId();
        boolean isHigherPriority = this.getPriority() > task.getPriority();
        boolean isSamePriority = this.getPriority() == task.getPriority();

        if (isSameRequest) {
            if (isSamePriority) {
                return 0;
            }
            if (isHigherPriority){
                return -1;
            }
            return 1;
        }

        if (isOlderRequest) {
            return -1;
        }
        return 1;
    }

}