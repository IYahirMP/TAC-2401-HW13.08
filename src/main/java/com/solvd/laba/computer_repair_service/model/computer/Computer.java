package com.solvd.laba.computer_repair_service.model.computer;

import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.model.computer.hardware.*;

import java.util.ArrayList;

/**
 * The class Computer represents a physical computer that is subject
 * to computer repair services. This class holds information regarding
 * the computer's serial number, brand, model, production year, and whether
 * it is a custom build.
 * The class provides methods to manage computer data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Computer {

    /** Holds the computer's id for the repair service */
    private int computerId;

    /** Holds the computer's serial number if available. */
    private String serialNumber;

    /** Holds the computer's brand if available. */
    private String brand;

    /** Holds the computer's model if available. */
    private String model;

    /** Holds the computer's year of production. */
    private int year;

    /** Indicates if the computer is a custom build. */
    private boolean isCustomAssembled;

    /** Holds the computer's form factor */
    private FormFactor formFactor;

    /** Holds the computer's operating system */
    private OperatingSystem operatingSystem;

    private Motherboard motherboard;
    private Processor processor;
    private DiscreteGPU discreteGPU;
    private IntegratedGPU internalGPU;
    private LinkedList<RAM> ram;

    /**
     * The default constructor for Computer.
     * Initializes serialNumber, brand and model to an empty string,
     * year to 0, id to -1, and isCustomAssembled to false.
     */
    public Computer() {
        this.computerId = -1;
        this.serialNumber = "";
        this.brand = "";
        this.model = "";
        this.year = 0;
        this.isCustomAssembled = false;
        this.formFactor = FormFactor.DESKTOP;
    }

    /**
     * Custom constructor for Computer.
     * Initializes serialNumber, brand, model, year and isCustomAssembled
     * to their specified values.
     * @param computerId The computer's assigned id for the computer repair service
     * @param serialNumber The computer's serial number.
     * @param brand The computer's brand.
     * @param model The computer's model.
     * @param year The computer's production year
     * @param isCustomAssembled Whether the computer was a custom assembly or not.
     * @param formFactor The computer's form factor
     */
    public Computer(int computerId, String serialNumber, String brand, String model,
                    int year, boolean isCustomAssembled, Motherboard motherboard, Processor processor,
                    DiscreteGPU discreteGPU, IntegratedGPU internalGPU, LinkedList<RAM> ram,
                    FormFactor formFactor, OperatingSystem operatingSystem) {
        this.computerId = computerId;
        this.serialNumber = serialNumber != null ? serialNumber : "";  // Set default if null
        this.brand = brand != null ? brand : "";                     // Set default if null
        this.model = model != null ? model : "";                     // Set default if null
        this.year = year;
        this.isCustomAssembled = isCustomAssembled;
        this.motherboard = motherboard;
        this.processor = processor;
        this.discreteGPU = discreteGPU;
        this.internalGPU = internalGPU;
        this.ram = ram;
        this.formFactor = formFactor;
        this.operatingSystem = operatingSystem;
    }

    /**
     * Custom constructor for Computer intended for computers not built by any trademark
     * Initializes serialNumber, brand and model to "N/A", isCustomAssembled is set to true,
     * and assigns the given computerId and year.
     * @param computerId The new computer's id for the computer repair service.
     * @param year The new computer's year of assembly.
     */
    public Computer(int computerId, int year) {
        this.computerId = computerId;
        this.serialNumber = "N/A";
        this.brand = "N/A";
        this.model = "N/A";
        this.year = year;
        this.isCustomAssembled = true;
    }

    /**
     * Retrieves the computer's computer repair service id.
     * @return computer's id for the computer repair service.
     */
    public int getComputerId() {
        return computerId;
    }

    /**
     * Sets the computer's id for the computer repair service.
     * @param computerId The new computer's id for the computer repair service.
     */
    public void setComputerId(int computerId) {
        this.computerId = computerId;
    }

    /**
     * Retrieves the serial number of the computer.
     * @return The serialNumber of the Computer.
     */
    public String getSerialNumber() {
        return this.serialNumber;
    }

    /**
     * Sets the serial number of the computer.
     * @param serialNumber The serial number to set for the Computer.
     */
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    /**
     * Retrieves the brand of the computer.
     * @return The brand of the Computer.
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * Sets the brand of the computer.
     * @param brand The brand to set for the Computer.
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * Retrieves the model of the computer.
     * @return The model of the Computer.
     */
    public String getModel() {
        return this.model;
    }

    /**
     * Sets the model of the computer.
     * @param model The model to set for the Computer.
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * Retrieves the year of production of the computer.
     * @return The year of production of the Computer.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Sets the year of production of the computer.
     * @param year The year to set for the Computer.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Checks if the computer is a custom build.
     * @return True if the Computer is custom assembled, false otherwise.
     */
    public boolean isCustomAssembled() {
        return this.isCustomAssembled;
    }

    /**
     * Sets whether the computer is a custom assembly.
     * @param isCustomAssembled True if the Computer is custom assembled, false otherwise.
     */
    public void setCustomAssembled(boolean isCustomAssembled) {
        this.isCustomAssembled = isCustomAssembled;
    }

    public Motherboard getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Motherboard motherboard) {
        this.motherboard = motherboard;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public DiscreteGPU getDiscreteGPU() {
        return discreteGPU;
    }

    public void setDiscreteGPU(DiscreteGPU discreteGPU) {
        this.discreteGPU = discreteGPU;
    }

    public IntegratedGPU getInternalGPU() {
        return internalGPU;
    }

    public void setInternalGPU(IntegratedGPU internalGPU) {
        this.internalGPU = internalGPU;
    }

    public LinkedList<RAM> getRam() {
        return ram;
    }

    public void setRam(LinkedList<RAM> ram) {
        this.ram = ram;
    }

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Computer ID: ").append(computerId).append("\n");
        builder.append("Serial Number: ").append(serialNumber).append("\n");
        builder.append("Brand: ").append(brand).append("\n");
        builder.append("Model: ").append(model).append("\n");
        builder.append("Year: ").append(year).append("\n");
        builder.append("Custom Assembled: ").append(isCustomAssembled).append("\n");
        builder.append("Form factor: ").append(formFactor.toString()).append("\n");
        builder.append("Operating system: ").append(operatingSystem).append("\n");
        builder.append(motherboard == null ? "N/A" : motherboard.toString()).append("\n");
        builder.append(processor == null ? "N/A" : processor.toString()).append("\n");
        builder.append(discreteGPU == null ? "N/A" : discreteGPU.toString()).append("\n");
        builder.append(internalGPU == null ? "Internal GPU: N/A" : internalGPU.toString()).append("\n");
        if (ram != null && !ram.isEmpty()) {
            int i = 1;
            for (RAM ramModule : ram) {
                String ramNo = "[RAM " + i + "] " + ramModule.toString();
                builder.append(ramNo).append("\n");
                i++;
            }
        } else {
            builder.append("N/A");
        }
        return builder.toString();
    }
}
