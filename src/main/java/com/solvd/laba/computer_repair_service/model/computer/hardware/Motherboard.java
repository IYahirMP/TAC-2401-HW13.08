package com.solvd.laba.computer_repair_service.model.computer.hardware;

public class Motherboard {
    public enum MotherboardFormFactor { ATX, MICRO_ATX, MINI_ITX, NANO_ITX, PICO_ITX, LAPTOP }
    private MotherboardFormFactor formFactor;

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

    // Getters and setters
    public MotherboardFormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(MotherboardFormFactor formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Motherboard:\n");
        builder.append("  Form Factor: ").append(formFactor).append("\n");
        return builder.toString();
    }
}