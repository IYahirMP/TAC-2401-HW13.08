package com.solvd.laba.computer_repair_service.computer.hardware;

import java.util.ArrayList;

public class IntegratedGPU extends GraphicalUnit {
    private boolean sharesMemory;

    // Constructors
    public IntegratedGPU() {
        super();
        this.sharesMemory = false;
    }

    public IntegratedGPU(int vram, float coreClock, ComputerInterface interfaceType, ArrayList<ComputerInterface> outputPorts, boolean sharesMemory) {
        super(vram, coreClock, interfaceType, outputPorts);
        this.sharesMemory = sharesMemory;
    }

    // Getters and setters
    public boolean getSharesMemory() {
        return sharesMemory;
    }

    public void setSharesMemory(boolean sharesMemory) {
        this.sharesMemory = sharesMemory;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Integrated GPU:\n");
        builder.append(super.toString()); // Include information from GraphicalUnit's toString
        builder.append("  Shares Memory: ").append(sharesMemory).append("\n");
        return builder.toString();
    }
}