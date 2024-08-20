package com.solvd.laba.computer_repair_service.computer.hardware;

public class Motherboard {
    public enum MotherboardFormFactor { ATX, MICRO_ATX, MINI_ITX, NANO_ITX, PICO_ITX, LAPTOP }
    private MotherboardFormFactor formFactor;

    // Constructors
    public Motherboard() {
        // Default constructor can initialize values here
    }

    public Motherboard(MotherboardFormFactor formFactor) {
        this.formFactor = formFactor;
    }

    // Getters and setters
    public MotherboardFormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(MotherboardFormFactor formFactor) {
        this.formFactor = formFactor;
    }
}