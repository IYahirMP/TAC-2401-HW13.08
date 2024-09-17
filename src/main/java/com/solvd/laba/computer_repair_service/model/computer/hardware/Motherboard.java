package com.solvd.laba.computer_repair_service.model.computer.hardware;

import java.sql.Array;
import java.util.ArrayList;

public class Motherboard {
    public enum MotherboardFormFactor { ATX, MICRO_ATX, MINI_ITX, NANO_ITX, PICO_ITX, LAPTOP }
    private MotherboardFormFactor formFactor;
    private ArrayList<ComputerInterface> interfaces = new ArrayList<>();

    /**
     * Constructor
     * Defaults formFactor to ATX
     */
    public Motherboard() {
        formFactor = MotherboardFormFactor.ATX;
    }

    public Motherboard(MotherboardFormFactor formFactor) {
        this.formFactor = formFactor;
    }

    public Motherboard(MotherboardFormFactor formFactor, ArrayList<ComputerInterface> interfaces) {
        this.formFactor = formFactor;
        this.interfaces = interfaces;
    }

    // Getters and setters
    public MotherboardFormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(MotherboardFormFactor formFactor) {
        this.formFactor = formFactor;
    }

    public ArrayList<ComputerInterface> getInterfaces() {
        return interfaces;
    }

    public void setInterfaces(ArrayList<ComputerInterface> interfaces) {
        this.interfaces = interfaces;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Motherboard:\n");
        builder.append("  Form Factor: ").append(formFactor).append("\n");
        return builder.toString();
    }
}