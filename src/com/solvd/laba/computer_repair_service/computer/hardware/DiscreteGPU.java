package com.solvd.laba.computer_repair_service.computer.hardware;

public class DiscreteGPU extends GraphicalUnit {
    private int powerConnectors;

    // Constructors
    public DiscreteGPU() {
        super();
        this.powerConnectors = 0;
    }

    public DiscreteGPU(int vram, float coreClock, ComputerInterface interfaceType, ComputerInterface[] outputPorts, int powerConnectors) {
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
}