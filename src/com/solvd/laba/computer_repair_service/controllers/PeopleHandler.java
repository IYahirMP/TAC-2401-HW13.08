package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.computer.specialties.*;
import com.solvd.laba.computer_repair_service.model.people.Customer;
import com.solvd.laba.computer_repair_service.model.people.Employee;
import com.solvd.laba.computer_repair_service.model.people.Technician;

import java.util.HashMap;
import java.util.Scanner;

public class PeopleHandler {
    private int nextTechnicianId;
    private int nextEmployeeId;
    private enum SoftwareSpecialty {LINUX, MAC, WINDOWS}
    private enum HardwareSpecialty {ALL_IN_ONE, DESKTOP, LAPTOP}
    private HashMap<Integer, Employee> employees;
    private HashMap<Integer, Technician> technicians;

    public PeopleHandler() {
        nextTechnicianId = 0;
        technicians = new HashMap<>();
    }

    // Main Logic starts here

    protected Technician createTechnician(){
        Technician newTechnician;
        Scanner sc = new Scanner(System.in);
        String firstName;
        String lastName;
        String address;
        String email;
        String phoneNumber;
        int employeeId = nextEmployeeId;
        int technicianId = nextTechnicianId;
        OperatingSystemSpecialty softwareSpecialty;
        FormFactorSpecialty hardwareSpecialty;

        System.out.println("Registering new technician.");

        System.out.print("First name: " );
        firstName = sc.nextLine();
        System.out.print("Last name: " );
        lastName = sc.nextLine();
        System.out.print("Address: " );
        address = sc.nextLine();
        System.out.print("Email: " );
        email = sc.nextLine();
        System.out.print("Phone number: " );
        phoneNumber = sc.nextLine();

        softwareSpecialty = chooseSoftwareSpecialty();
        hardwareSpecialty = chooseHardwareSpecialty();

        newTechnician = new Technician(
                firstName,
                lastName,
                address,
                email,
                phoneNumber,
                employeeId,
                technicianId,
                softwareSpecialty,
                hardwareSpecialty
        );

        employees.put(employeeId, newTechnician);
        technicians.put(technicianId, newTechnician);
        nextEmployeeId++;
        nextTechnicianId++;
        return newTechnician;
    }

    protected OperatingSystemSpecialty chooseSoftwareSpecialty(){
        OperatingSystemSpecialty softwareSpecialty;
        Scanner sc = new Scanner(System.in);
        int softwareOption;

        System.out.println("Choose a software specialty: ");

        SoftwareSpecialty[] softwareSpecialties = SoftwareSpecialty.values();
        for(int i = 0; i < softwareSpecialties.length; i++) {
            System.out.println("\t" + i + ") " + softwareSpecialties[i].name());
        }
        softwareOption = sc.nextInt();

        softwareSpecialty = switch (softwareOption) {
            case 1 -> new LinuxSpecialty();
            case 2 -> new MacSpecialty();
            case 3 -> new WindowsSpecialty();
            default -> null;
        };

        return softwareSpecialty;
    }

    protected FormFactorSpecialty chooseHardwareSpecialty(){
        FormFactorSpecialty hardwareSpecialty;
        Scanner sc = new Scanner(System.in);
        int hardwareOption;

        System.out.println("Choose a hardware specialty: ");

        HardwareSpecialty[] hardwareSpecialties = HardwareSpecialty.values();
        for(int i = 0; i < hardwareSpecialties.length; i++) {
            System.out.println("\t" + i + ") " + hardwareSpecialties[i].name());
        }
        hardwareOption = sc.nextInt();

        hardwareSpecialty = switch (hardwareOption) {
            case 1 -> new AllInOneSpecialty();
            case 2 -> new DesktopSpecialty();
            case 3 -> new LaptopSpecialty();
            default -> null;
        };

        return hardwareSpecialty;
    }

    // Getters and setters start here


    public HashMap<Integer, Technician> getTechnicians() {
        return technicians;
    }

    public void setTechnicians(HashMap<Integer, Technician> technicians) {
        this.technicians = technicians;
    }

    public int getNextTechnicianId() {
        return nextTechnicianId;
    }

    public void setNextTechnicianId(int nextTechnicianId) {
        this.nextTechnicianId = nextTechnicianId;
    }

    public int getNextEmployeeId() {
        return nextEmployeeId;
    }

    public void setNextEmployeeId(int nextEmployeeId) {
        this.nextEmployeeId = nextEmployeeId;
    }

    public HashMap<Integer, Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(HashMap<Integer, Employee> employees) {
        this.employees = employees;
    }
}
