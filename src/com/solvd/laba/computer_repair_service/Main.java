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

        Motherboard motherboard = new Motherboard(Motherboard.MotherboardFormFactor.ATX);
        Processor processor = new Processor(8, 16, 3.6f, 16,
                Processor.ProcessorArchitecture.X86_64);

        ComputerInterface gpuInterface = ComputerInterface.createPCIE();
        ArrayList<ComputerInterface> outputPorts = new ArrayList<ComputerInterface>();
        outputPorts.add(ComputerInterface.createHDMI());
        outputPorts.add(ComputerInterface.createDP());
        DiscreteGPU discreteGPU = new DiscreteGPU(8192, 1600,
                gpuInterface, outputPorts, 1);

        ArrayList<RAM> rams = new ArrayList<RAM>();
        rams.add(new RAM(16384, 2666, 2133, 2400));
        rams.add(new RAM(16384, 2666, 2133, 2400));

        Computer computer = new Computer(123, "ABC12345",
                "BrandX", "ModelY", 2023, true,
                motherboard, processor, discreteGPU, null, rams);

        //System.out.println(customer);
        //System.out.println(computer);

        ServiceRequest request = new ServiceRequest(
                1, LocalDate.now(), ServiceStatus.ONGOING,
                "Fix my computer"
        );


    }
}
