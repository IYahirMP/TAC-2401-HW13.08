package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceStatus;

import java.time.LocalDate;
import java.util.HashMap;

public class RequestController {
    private int nextRequestId;
    private HashMap<Integer, ServiceRequest> requests;

    public RequestController() {
        requests = new HashMap<>();
        nextRequestId = 0;
    }

    public ServiceRequest createRequest(HashMap<String, SingleInput<?>> inputs) {
        ServiceRequest newRequest = new ServiceRequest(
                nextRequestId,
                LocalDate.now(),
                ServiceStatus.ONGOING,
                (String) inputs.get("Description").getValue()
        );

        requests.put(nextRequestId, newRequest);
        nextRequestId++;

        return newRequest;
    }

}