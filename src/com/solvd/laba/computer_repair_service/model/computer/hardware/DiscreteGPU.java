package com.solvd.laba.computer_repair_service.model.computer.hardware;

import java.util.ArrayList;

public class DiscreteGPU extends GraphicalUnit {
    private int powerConnectors;

    // Constructors
    public DiscreteGPU() {
        super();
        this.powerConnectors = 0;
    }

    public DiscreteGPU(int vram, float coreClock, ComputerInterface interfaceType, ArrayList<ComputerInterface> outputPorts, int powerConnectors) {
        super(vram, coreClock, interfaceType, outputPorts);
        this.powerConnectors = powerConnectors;
    }

    // Getters and setters
    public int getPowerConnectors() {
        return powerConnectors;
    }

    public void setPowerConnectors(int powerConnectors) {
        this.powerConnectors = powerConnectors;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Discrete GPU: \n");
        builder.append(super.toString()); // Include information from GraphicalUnit's toString
        builder.append("  Power Connectors: ").append(powerConnectors).append("\n");
        return builder.toString();
    }
}