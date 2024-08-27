package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceStatus;

import java.time.LocalDate;
import java.util.HashMap;

public class RequestController {
    private static int nextRequestId;
    private static HashMap<Integer, ServiceRequest> requests;

    static{
        requests = new HashMap<>();
        nextRequestId = 0;
    }

    public RequestController() {}

    public ServiceRequest createRequest(HashMap<String, String> inputs) {
        ServiceRequest newRequest = new ServiceRequest(
                nextRequestId,
                LocalDate.now(),
                ServiceStatus.ONGOING,
                inputs.get("Description")
        );

        requests.put(nextRequestId, newRequest);
        nextRequestId++;

        return newRequest;
    }

}