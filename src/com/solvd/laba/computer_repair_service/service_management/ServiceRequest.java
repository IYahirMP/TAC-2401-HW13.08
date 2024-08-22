package com.solvd.laba.computer_repair_service.service_management;

import com.solvd.laba.computer_repair_service.accounting.Order;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * The class ServiceRequest represents a service request of the computer
 * repair service. It holds information such as the request id, request date,
 * status, and a brief description of the requested services.
 * The class provides methods to manage service request data;
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class ServiceRequest {

    /** Holds the service request id. */
    private int requestId;

    /** Holds the date services were requested*/
    private LocalDate requestDate;

    /** Holds the status of the request */
    private ServiceStatus status;

    /** Holds a brief description of the request */
    private String description;

    /** List of tasks to do */
    private ArrayList<Task> tasks;

    private Order order;

    /**
     * Default constructor for ServiceRequest.
     * It initializes requestId as -1, requestDate as today's date,
     * status and description as empty strings.
     */
    public ServiceRequest() {
        this.requestId = 0;
        this.requestDate = LocalDate.now();
        this.status = ServiceStatus.ON_HOLD;
        this.description = "";
        this.tasks = new ArrayList<>();
    }

    /**
     * Constructs a ServiceRequest setting custom values for requestId,
     * requestDate, status and description.
     * @param requestId Request id for the new ServiceRequest.
     * @param requestDate Request date for the new ServiceRequest.
     * @param status Current status for the new ServiceRequest.
     * @param description Brief description of the requested services in the new ServiceRequest.
     */
    public ServiceRequest(int requestId, LocalDate requestDate,
                          ServiceStatus status, String description) {
        this.requestId = requestId;
        this.requestDate = requestDate;
        this.status = status;
        this.description = description;
        this.tasks = new ArrayList<>();
    }

    /**
     * Constructs a ServiceRequest setting custom values for requestId,
     * requestDate, status and description.
     * @param requestId Request id for the new ServiceRequest.
     * @param requestDate Request date for the new ServiceRequest.
     * @param status Current status for the new ServiceRequest.
     * @param description Brief description of the requested services in the new ServiceRequest.
     * @param tasks The ServiceTasks to do.
     */
    public ServiceRequest(int requestId, LocalDate requestDate,
                          ServiceStatus status, String description, ArrayList<Task> tasks) {
        this.requestId = requestId;
        this.requestDate = requestDate;
        this.status = status;
        this.description = description;
        this.tasks = tasks;
    }

    /**
     * Constructs a ServiceRequest using only a requestId, status and description.
     * requestDate is set as current date.
     * @param requestId Request id for the new ServiceRequest.
     * @param status Current status for the new ServiceRequest.
     * @param description Brief description of the requested services in the new ServiceRequest.
     */
    public ServiceRequest(int requestId, ServiceStatus status, String description) {
        this.requestId = requestId;
        this.requestDate = LocalDate.now();
        this.status = status;
        this.description = description;
        this.tasks = new ArrayList<>();
    }

    /**
     * Retrieves the id of the service request.
     * @return The requestId associated with the ServiceRequest.
     */
    public int getRequestId() {
        return requestId;
    }

    /**
     * Updates the current requestId with the provided value.
     * @param requestId The requestId to set for the ServiceRequest.
     */
    public void setRequestId(int requestId) {
        this.requestId = requestId;
    }

    /**
     * Retrieves the request date of the service request.
     * @return The request date of the ServiceRequest.
     */
    public LocalDate getRequestDate() {
        return this.requestDate;
    }

    /**
     * Updates the request date with the provided date.
     * @param requestDate The new date for the ServiceRequest.
     */
    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * Retrieves the current status of the service request.
     * @return The current status of the ServiceRequest.
     */
    public ServiceStatus getStatus() {
        return this.status;
    }

    /**
     * Updates the status of the service request with the provided value.
     * @param status The new status for the ServiceRequest.
     */
    public void setStatus(ServiceStatus status) {
        this.status = status;
    }

    /**
     * Retrieves a brief description of the requested services.
     * @return The description of the ServiceRequest.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Updates the description of the requested services with the new description.
     * @param description New description for the ServiceRequest.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void setTasks(ArrayList<Task> tasks) {
        this.tasks = tasks;
    }

    public void addTask(Task task) {
        this.tasks.add(task);
    }

    public void removeTask(Task task) {
        this.tasks.remove(task);
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public void printInfo(){
        System.out.println("Request ID: " + this.requestId);
        System.out.println("Request Date: " + this.requestDate);
        System.out.println("Status: " + this.status);
        System.out.println("Description: " + this.description);
        System.out.println("------------------------------------");
    }
}