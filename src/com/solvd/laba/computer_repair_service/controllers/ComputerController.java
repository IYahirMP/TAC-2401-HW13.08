package com.solvd.laba.computer_repair_service.controllers;

import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.hardware.*;

import java.util.HashMap;

public class ComputerController implements Controller{
    private static int nextComputerId;
    private static int nextHardwareId;
    private static LinkedList<Computer> computers;

    static{
        computers = new LinkedList<>();
        nextComputerId = 0;
        nextHardwareId = 0;
    }

    public ComputerController() {}

    /** Main Logic */

    public Computer create(){
        // Variable declarations
        Motherboard motherboard;
        Processor processor;
        LinkedList<RAM> rams;
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

        computers.add(newComputer);
        nextComputerId++;
        return newComputer;
    }

    public void update(int id){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void delete(int id){
        computers.remove(id);
    }

    public void show(int id){
        throw new UnsupportedOperationException("Not yet supported operation");
    }

    public Computer find(int id){
        return computers.get(id);
    }

    private LinkedList<RAM> createRAM(){
        LinkedList<RAM> rams = new LinkedList<>();
        rams.add(new RAM(16384, 2666, 2133, 2400));
        rams.add(new RAM(16384, 2666, 2133, 2400));

        return rams;
    }

    private DiscreteGPU createDiscreteGPU(){

        // Variable initialization
        ComputerInterface gpuInterface;
        LinkedList<ComputerInterface> outputPorts;
        DiscreteGPU discreteGPU;

        // Creation of GPU 's PCIE interface
        gpuInterface = ComputerInterface.createPCIE();

        // Creation of GPU output ports
        outputPorts = new LinkedList<>();
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

    /** Getters and setters */

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

    public LinkedList<Computer> getComputers() {
        return computers;
    }

    public void setComputers(LinkedList<Computer> computers) {
        this.computers = computers;
    }
}
