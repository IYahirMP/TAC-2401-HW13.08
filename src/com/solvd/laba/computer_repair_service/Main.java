package com.solvd.laba.computer_repair_service;

import com.solvd.laba.computer_repair_service.computer.Computer;
import com.solvd.laba.computer_repair_service.computer.hardware.*;
import com.solvd.laba.computer_repair_service.people.Customer;
import com.solvd.laba.computer_repair_service.service_management.ServiceRequest;
import com.solvd.laba.computer_repair_service.service_management.ServiceStatus;

import java.security.Provider;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Customer customer = new Customer(1, "Ivan", "Mojica",
                "Some Street, Guerrero, Mexico", "iymojcapineda.laba@solvd.com", "+527331022083");

        System.out.println(customer);

        ServiceRequest request = new ServiceRequest(
                1, LocalDate.now(), ServiceStatus.ONGOING,
                "Fix my computer"
        );


    }
}
