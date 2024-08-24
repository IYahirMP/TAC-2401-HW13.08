package com.solvd.laba.computer_repair_service.model.computer.hardware;

public class RAM extends Memory{
    private int frequency;

    public RAM(){
        super();
        this.frequency = 0;
    }

    public RAM(int capacity, int readSpeed, int writeSpeed, int frequency){
        super(capacity, readSpeed, writeSpeed, ComputerInterface.createPCIE());
        this.frequency = frequency;
    }

    public int getFrequency(){
        return frequency;
    }

    public void setFrequency(int frequency){
        this.frequency = frequency;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.toString()); // Include information from Memory's toString
        builder.append("  Frequency: ").append(frequency).append(" MHz\n");
        return builder.toString();
    }
}
