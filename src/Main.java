import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Customer customer1 = new Customer();
        Customer customer2 = new Customer(1, "Ivan", "Mojica",
                "2025 M Street, SomeCity, SomeState", "iymojicapineda.laba@solv.com",
                "+521234567891");
        Customer customer3 = new Customer(2, "Yahir", "Pineda");

        Computer computer1 = new Computer();
        Computer computer2 = new Computer(1, "ABC123DFG3451", "Hewlett-Packard",
                "Pf-14f203",
                2018, false);
        Computer computer3 = new Computer(2, 2023);

        customer1.printInfo();
        customer2.printInfo();
        customer3.printInfo();

        computer1.printInfo();
        computer2.printInfo();
        computer3.printInfo();


    }
}
