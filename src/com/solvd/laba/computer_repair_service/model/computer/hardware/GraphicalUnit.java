package com.solvd.laba.computer_repair_service.model.computer.hardware;

import java.util.ArrayList;

public class GraphicalUnit {
    private int vram;
    private float coreClock;
    private ComputerInterface interfaceType;
    private ArrayList<ComputerInterface> outputPorts;

    // Constructors
    public GraphicalUnit() {
        // Default constructor can initialize values here
    }

    public GraphicalUnit(int vram, float coreClock, ComputerInterface interfaceType, ArrayList<ComputerInterface> outputPorts) {
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

    public ArrayList<ComputerInterface> getOutputPorts() {
        return outputPorts;
    }

    public void setOutputPorts(ArrayList<ComputerInterface> outputPorts) {
        this.outputPorts = outputPorts;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("VRAM: ").append(vram).append(" MB\n");
        builder.append("Core Clock: ").append(coreClock).append(" GHz\n");
        builder.append("Interface Type: ").append(interfaceType).append("\n");
        builder.append("Output Ports: \n");
        if (outputPorts != null && !outputPorts.isEmpty()) {
            for (ComputerInterface port : outputPorts) {
                builder.append(port).append("\n");
            }
        } else {
            builder.append("N/A");
        }
        return builder.toString();
    }
}