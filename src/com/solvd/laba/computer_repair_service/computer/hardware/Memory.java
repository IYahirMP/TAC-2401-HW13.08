package com.solvd.laba.computer_repair_service.computer.hardware;

import com.solvd.laba.computer_repair_service.computer.Computer;

public class Memory extends Hardware{
    private int capacity;
    private int readSpeed;
    private int writeSpeed;
    private ComputerInterface computerInterface;

    public Memory(){
        this.capacity = 0;
        this.readSpeed = 0;
        this.writeSpeed = 0;
        this.computerInterface = new ComputerInterface();
    }

    public Memory(int capacity, int readSpeed, int writeSpeed, ComputerInterface computerInterface) {
        this.capacity = capacity;
        this.readSpeed = readSpeed;
        this.writeSpeed = writeSpeed;
        this.computerInterface = computerInterface;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getReadSpeed() {
        return readSpeed;
    }

    public void setReadSpeed(int readSpeed) {
        this.readSpeed = readSpeed;
    }

    public int getWriteSpeed() {
        return writeSpeed;
    }

    public void setWriteSpeed(int writeSpeed) {
        this.writeSpeed = writeSpeed;
    }

    public ComputerInterface getComputerInterface() {
        return computerInterface;
    }

    public void setComputerInterface(ComputerInterface computerInterface) {
        this.computerInterface = computerInterface;
    }
}
