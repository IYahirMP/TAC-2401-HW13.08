import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        instantiateCustomers();
        instantiateComputers();
        instantiateComputerParts();
        instantiateInvoices();
        instantiatePayments();
        instantiateServiceRequests();
        instantiateServiceTasks();
        instantiateSoftware();
        instantiateTechnicians();
        instantiateTools();
    }

    private static void instantiateCustomers(){
        Customer customer1 = new Customer();
        Customer customer2 = new Customer(1, "Ivan", "Mojica",
                "2025 M Street, SomeCity, SomeState", "iymojicapineda.laba@solv.com",
                "+521234567891");
        Customer customer3 = new Customer(2, "Yahir", "Pineda");

        customer1.printInfo();
        customer2.printInfo();
        customer3.printInfo();
    }

    private static void instantiateComputers(){
        Computer computer1 = new Computer();
        Computer computer2 = new Computer(1, "ABC123DFG3451", "Hewlett-Packard",
                "Pf-14f203",
                2018, false);
        Computer computer3 = new Computer(2, 2023);

        computer1.printInfo();
        computer2.printInfo();
        computer3.printInfo();
    }

    private static void instantiateComputerParts(){
        ComputerPart computerPart1 = new ComputerPart();
        ComputerPart computerPart2 = new ComputerPart(1, "Intel Core i5-11500f", "Intel", 500.0);
        ComputerPart computerPart3 = new ComputerPart(2, "Intel Core i3-4005u", "Intel", 200.0);

        computerPart1.printInfo();
        computerPart2.printInfo();
        computerPart3.printInfo();
    }

    private static void instantiateInvoices(){
        Invoice invoice1 = new Invoice();
        Invoice invoice2 = new Invoice(1, LocalDate.now(), 300.0, "Ivan Mojica");

        invoice1.printInfo();
        invoice2.printInfo();
    }

    private static void instantiatePayments(){
        Payment payment1 = new Payment();
        Payment payment2 = new Payment(1, 500.0, LocalDate.now(), "Credit card");

        payment1.printInfo();
        payment2.printInfo();
    }

    private static void instantiateServiceRequests(){
        ServiceRequest serviceRequest1 = new ServiceRequest();
        ServiceRequest serviceRequest2 = new ServiceRequest(1, LocalDate.now(), "Ongoing",
                "Diagnose and repair three Dell desktop computers");
        ServiceRequest serviceRequest3 = new ServiceRequest(2, "Ongoing",
                "Perform preventive maintenance on an HP Laptop.");

        serviceRequest1.printInfo();
        serviceRequest2.printInfo();
        serviceRequest3.printInfo();
    }

    private static void instantiateServiceTasks(){
        ServiceTask serviceTask1 = new ServiceTask();
        ServiceTask serviceTask2 = new ServiceTask(1, "Perform preventive maintenance on HP laptop device.",
                ServiceTask.Status.ONGOING, 3, 100.0);
        ServiceTask serviceTask3 = new ServiceTask(2,
                "Perform corrective maintenance on Dell desktop device", 100.0);

        serviceTask1.printInfo();
        serviceTask2.printInfo();
        serviceTask3.printInfo();
    }

    private static void instantiateSoftware(){
        Software software1 = new Software();

        LocalDate purchaseDate = LocalDate.now();
        LocalDate expireDate = LocalDate.of(2026,8,12);
        Software software2 = new Software(1,"Kaspersky Antivirus", "v4.3.1",
                "ASD123SFG4532KAZ", "Kaspersky Lab", purchaseDate, expireDate,
                200.0, "Antivirus", "Active");

        software1.printInfo();
        software2.printInfo();
    }

    private static void instantiateTechnicians(){
        Technician technician1 = new Technician();
        Technician technician2 = new Technician(1, "Ivan", "Mojica",
                1, "Desktop devices");

        technician1.printInfo();
        technician2.printInfo();
    }

    private static void instantiateTools(){
        Tool tool1 = new Tool();
        Tool tool2 = new Tool(1, "Star screwdriver", "Screwdriver", "Remove star shaped screws.");

        tool1.printInfo();
        tool2.printInfo();
    }
}
