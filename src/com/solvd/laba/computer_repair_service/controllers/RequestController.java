package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceStatus;
import com.solvd.laba.computer_repair_service.views.request.CreateRequestView;

import java.time.LocalDate;
import java.util.HashMap;

public class RequestController implements Controller{
    private static int nextRequestId;
    private static HashMap<Integer, ServiceRequest> requests;
    private static CreateRequestView createRequestView;


    static{
        requests = new HashMap<>();
        nextRequestId = 0;
        createRequestView = new CreateRequestView();
    }

    public RequestController() {}

    public ServiceRequest create() {
        createRequestView.display();
        HashMap<String, String> inputs = createRequestView.getInputs();

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

    public ServiceRequest find(int id) {
        return requests.get(id);
    }

    public void show(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(int id) {
        requests.remove(id);
    }

    public void update(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}