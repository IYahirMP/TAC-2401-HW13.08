package com.solvd.laba.computer_repair_service.service_management;

import java.time.LocalDate;

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
    private String status;

    /** Holds a brief description of the request */
    private String description;

    /**
     * Default constructor for ServiceRequest.
     * It initializes requestId as -1, requestDate as today's date,
     * status and description as empty strings.
     */
    public ServiceRequest() {
        this.requestId = 0;
        this.requestDate = LocalDate.now();
        this.status = "";
        this.description = "";
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
                          String status, String description) {
        this.requestId = requestId;
        this.requestDate = requestDate;
        this.status = status;
        this.description = description;
    }

    /**
     * Constructs a ServiceRequest using only a requestId, status and description.
     * requestDate is set as current date.
     * @param requestId Request id for the new ServiceRequest.
     * @param status Current status for the new ServiceRequest.
     * @param description Brief description of the requested services in the new ServiceRequest.
     */
    public ServiceRequest(int requestId, String status, String description) {
        this.requestId = requestId;
        this.requestDate = LocalDate.now();
        this.status = status;
        this.description = description;
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
    public String getStatus() {
        return this.status;
    }

    /**
     * Updates the status of the service request with the provided value.
     * @param status The new status for the ServiceRequest.
     */
    public void setStatus(String status) {
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

    public void printInfo(){
        System.out.println("Request ID: " + this.requestId);
        System.out.println("Request Date: " + this.requestDate);
        System.out.println("Status: " + this.status);
        System.out.println("Description: " + this.description);
        System.out.println("------------------------------------");
    }
}