package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.FormFactor;
import com.solvd.laba.computer_repair_service.model.computer.OperatingSystem;
import com.solvd.laba.computer_repair_service.model.computer.specialties.*;
import com.solvd.laba.computer_repair_service.model.people.Employee;
import com.solvd.laba.computer_repair_service.model.people.Technician;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class TechnicianController {
    private enum SoftwareSpecialty {LINUX, MAC, WINDOWS}
    private enum HardwareSpecialty {ALL_IN_ONE, DESKTOP, LAPTOP}

    private static int nextTechnicianId;
    private static int nextEmployeeId;
    private static HashMap<Integer, Employee> employees;
    private static HashMap<Integer, Technician> technicians;

    static{
        nextTechnicianId = 0;
        technicians = new HashMap<>();

        Technician technician1 = new Technician(
                "Jorge",
                "Salinas",
                "Oak Street",
                "JSalinas@domain.com",
                "1233211232",
                0,
                0,
                new WindowsSpecialty(),
                new DesktopSpecialty()
        );

        Technician technician2 = new Technician(
                "Ricardo",
                "Salinas",
                "Oak Street",
                "JSalinas@domain.com",
                "1233211232",
                0,
                0,
                new WindowsSpecialty(),
                new LaptopSpecialty()
        );

        Technician technician3 = new Technician(
                "Pedro",
                "Paramo",
                "Oak Street",
                "JSalinas@domain.com",
                "1233211232",
                0,
                0,
                new LinuxSpecialty(),
                new DesktopSpecialty()
        );

        Technician technician4 = new Technician(
                "Pedro",
                "Rodriguez",
                "Oak Street",
                "JSalinas@domain.com",
                "1233211232",
                0,
                0,
                new MacSpecialty(),
                new LaptopSpecialty()
        );

        technicians.put(0,technician1);
        technicians.put(1,technician2);
        technicians.put(2,technician3);
        technicians.put(3,technician4);
    }

    public TechnicianController() {}

    // Main Logic starts here

    public Technician searchTechnician(Computer computer){
        //Retrieves computer features
        FormFactor computerFormFactor = computer.getFormFactor();
        OperatingSystem computerOperatingSystem = computer.getOperatingSystem();

        CheckEligibleTechnician tester = new CheckEligibleTechnician();
        Predicate<Technician> isEligible = (t) -> tester.test(t, computer);

        List<Technician> eligibleTechnicians = new ArrayList<>();

        eligibleTechnicians = technicians.values()
                .stream()
                .filter(isEligible)
                .toList();

        if (!eligibleTechnicians.isEmpty()){
            return eligibleTechnicians.getFirst();
        }

        return null;
    }

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

    interface CheckTechnician{
        boolean test(Technician t, Computer c);
    }

    static class CheckEligibleTechnician implements CheckTechnician{
        public boolean test(Technician technician, Computer c) {
            //Retrieves computer features
            FormFactor computerFormFactor = c.getFormFactor();
            OperatingSystem computerOperatingSystem = c.getOperatingSystem();

            //Retrieve technician specialty
            OperatingSystem OSSpecialty = technician.getOperatingSystemSpecialty().getOperatingSystem();
            FormFactor FFSpecialty = technician.getFormFactorSpecialty().getFormFactor();

            boolean isSameOS = OSSpecialty.equals(computerOperatingSystem);
            boolean isSameFF = FFSpecialty.equals(computerFormFactor);
            //If both specialties match computer features, return technician
            return isSameOS && isSameFF;
        }
    }
}
