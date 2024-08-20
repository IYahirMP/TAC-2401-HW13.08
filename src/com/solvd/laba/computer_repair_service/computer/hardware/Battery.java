package com.solvd.laba.computer_repair_service.computer.hardware;

public class Battery {
    public enum BatteryType {LI_ION, LI_POLYMER};
    private int capacity;
    private BatteryType type;
    private float voltage;
    private int numberOfCells;

    // Constructors
    public Battery() {
        // Default constructor can initialize values here
    }

    public Battery(int capacity, BatteryType type, float voltage, int numberOfCells) {
        this.capacity = capacity;
        this.type = type;
        this.voltage = voltage;
        this.numberOfCells = numberOfCells;
    }

    // Getters and setters
    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BatteryType getType() {
        return type;
    }

    public void setType(BatteryType type) {
        this.type = type;
    }

    public float getVoltage() {
        return voltage;
    }

    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }

    public int getNumberOfCells() {
        return numberOfCells;
    }

    public void setNumberOfCells(int numberOfCells) {
        this.numberOfCells = numberOfCells;
    }
}
