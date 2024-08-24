package com.solvd.laba.computer_repair_service;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.hardware.*;
import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.model.service_management.ServiceRequest;

import java.util.ArrayList;

public class ComputerRepairService {
    private Customer customer;
    private Computer computer;
    private ServiceRequest request;

    public void repairService(){
        customer = new Customer(1, "Ivan", "Mojica",
                "Some Street, Guerrero, Mexico", "iymojcapineda.laba@solvd.com", "+527331022083");
    }
}
