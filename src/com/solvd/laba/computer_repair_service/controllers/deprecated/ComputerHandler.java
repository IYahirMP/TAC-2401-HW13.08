package com.solvd.laba.computer_repair_service.controllers.deprecated;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.hardware.*;

import java.util.ArrayList;
import java.util.HashMap;

public class ComputerHandler {
    private int nextComputerId;
    private int nextHardwareId;
    HashMap<Integer, Computer> computers;

    public ComputerHandler() {
        computers = new HashMap<>();
        nextComputerId = 0;
        nextHardwareId = 0;
    }

    /** Main Logic */

    Computer createComputer(){
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Computer register helper");
        System.out.print("Enter computer serial number: ");
        String serialNumber = scanner.nextLine();
        System.out.print("Enter computer brand: ");
        String brand = scanner.nextLine();
        System.out.print("Enter computer model: ");
        String model = scanner.nextLine();
        System.out.print("Enter computer year of assembly: ");
        int yearOfAssembly = scanner.nextInt();
        System.out.println("Is the computer assembled? ");
        System.out.print("1) Yes");
        System.out.print("2) No");
        int isAssembled = scanner.nextInt();*/

        // Variable declarations
        Motherboard motherboard;
        Processor processor;
        ArrayList<RAM> rams;
        DiscreteGPU discreteGPU;
        Computer newComputer;

        // Creation of motherboard
        motherboard = createMotherboard();

        // Creation of processor
        processor = createProcessor();

        // Creation of Discrete GPU
        discreteGPU = createDiscreteGPU();

        // Creation of RAMs
        rams = createRAM();

        newComputer = new Computer(
                nextComputerId,
                "ABC12345",
                "HP",
                "Pavillion-1015f",
                2023,
                false,
                motherboard,
                processor,
                discreteGPU,
                null,
                rams,
                Computer.FormFactor.LAPTOP);

        computers.put(nextComputerId, newComputer);
        nextComputerId++;
        return newComputer;
    }

    private ArrayList<RAM> createRAM(){
        ArrayList<RAM> rams = new ArrayList<RAM>();
        rams.add(new RAM(16384, 2666, 2133, 2400));
        rams.add(new RAM(16384, 2666, 2133, 2400));

        return rams;
    }

    private DiscreteGPU createDiscreteGPU(){

        // Variable initialization
        ComputerInterface gpuInterface;
        ArrayList<ComputerInterface> outputPorts;
        DiscreteGPU discreteGPU;

        // Creation of GPU 's PCIE interface
        gpuInterface = ComputerInterface.createPCIE();

        // Creation of GPU output ports
        outputPorts = new ArrayList<ComputerInterface>();
        outputPorts.add(ComputerInterface.createHDMI());
        outputPorts.add(ComputerInterface.createDP());

        // Creation of discrete GPU
        discreteGPU = new DiscreteGPU(
                8192,
                1600,
                gpuInterface,
                outputPorts,
                1
        );

        return discreteGPU;
    }

    private Processor createProcessor(){
        return new Processor(8, 16, 3.6f, 16,
                Processor.ProcessorArchitecture.X86_64);
    }

    private Motherboard createMotherboard(){
        return new Motherboard(Motherboard.MotherboardFormFactor.ATX);
    }

    public int getNextComputerId() {
        return nextComputerId;
    }

    public void setNextComputerId(int nextComputerId) {
        this.nextComputerId = nextComputerId;
    }

    public int getNextHardwareId() {
        return nextHardwareId;
    }

    public void setNextHardwareId(int nextHardwareId) {
        this.nextHardwareId = nextHardwareId;
    }

    /** Getters and setters */



    public HashMap<Integer, Computer> getComputers() {
        return computers;
    }

    public void setComputers(HashMap<Integer, Computer> computers) {
        this.computers = computers;
    }
}
