package com.solvd.laba.computer_repair_service.computer.hardware;

public class IntegratedGPU extends GraphicalUnit {
    private boolean sharesMemory;

    // Constructors
    public IntegratedGPU() {
        super();
        this.sharesMemory = false;
    }

    public IntegratedGPU(int vram, float coreClock, ComputerInterface interfaceType, ComputerInterface[] outputPorts, boolean sharesMemory) {
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
}