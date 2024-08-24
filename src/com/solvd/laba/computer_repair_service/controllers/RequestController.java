package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceStatus;
import com.solvd.laba.computer_repair_service.model.service_management.Task;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;

public class RequestController {
    private int nextRequestId;
    private HashMap<Integer, ServiceRequest> requests;

    public RequestController() {
        requests = new HashMap<>();
        nextRequestId = 0;
    }

    public void createRequest(HashMap<String, Input<?>> inputs) {
        ServiceRequest newRequest = new ServiceRequest(
                nextRequestId,
                LocalDate.now(),
                ServiceStatus.ONGOING,
                (String) inputs.get("Description").getValue()
        );

        requests.put(nextRequestId, newRequest);
        nextRequestId++;
    }

}