package com.solvd.laba.computer_repair_service.computer.hardware;

public class GraphicalUnit {
    private int vram;
    private float coreClock;
    private ComputerInterface interfaceType;
    private ComputerInterface[] outputPorts;

    // Constructors
    public GraphicalUnit() {
        // Default constructor can initialize values here
    }

    public GraphicalUnit(int vram, float coreClock, ComputerInterface interfaceType, ComputerInterface[] outputPorts) {
        this.vram = vram;
        this.coreClock = coreClock;
        this.interfaceType = interfaceType;
        this.outputPorts = outputPorts;
    }

    // Getters and setters
    public int getVram() {
        return vram;
    }

    public void setVram(int vram) {
        this.vram = vram;
    }

    public float getCoreClock() {
        return coreClock;
    }

    public void setCoreClock(float coreClock) {
        this.coreClock = coreClock;
    }

    public ComputerInterface getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(ComputerInterface interfaceType) {
        this.interfaceType = interfaceType;
    }

    public ComputerInterface[] getOutputPorts() {
        return outputPorts;
    }

    public void setOutputPorts(ComputerInterface[] outputPorts) {
        this.outputPorts = outputPorts;
    }
}