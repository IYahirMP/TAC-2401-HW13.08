package com.solvd.laba.computer_repair_service.computer.hardware;

public class ComputerInterface {
    public enum InterfaceType {MALE, FEMALE};
    public enum InterfaceName {USB, HDMI, DP, DVI, VGA, PCI, PCI_E, SATA, IDE, UNKNOWN};

    private InterfaceName name;
    private InterfaceType type;
    private boolean isBroken;

    public ComputerInterface() {
        this.name = InterfaceName.UNKNOWN;
        this.type = InterfaceType.MALE;
        this.isBroken = true;
    }

    public ComputerInterface(InterfaceName name, InterfaceType type) {
        this.name = name;
        this.type = type;
        this.isBroken = false;
    }

    public ComputerInterface(InterfaceName name, InterfaceType type, boolean isBroken) {
        this.name = name;
        this.type = type;
        this.isBroken = isBroken;
    }

    public InterfaceName getName() {
        return name;
    }

    public void setName(InterfaceName name) {
        this.name = name;
    }

    public InterfaceType getType() {
        return type;
    }

    public void setType(InterfaceType type) {
        this.type = type;
    }

    public boolean isBroken() {
        return isBroken;
    }

    public void setBroken(boolean broken) {
        isBroken = broken;
    }

    public static ComputerInterface createHDMI(){
        return new ComputerInterface(InterfaceName.HDMI, InterfaceType.FEMALE);
    }

    public static ComputerInterface createUSB(){
        return new ComputerInterface(InterfaceName.USB, InterfaceType.FEMALE);
    }

    public static ComputerInterface createDP(){
        return new ComputerInterface(InterfaceName.DP, InterfaceType.FEMALE);
    }

    public static ComputerInterface createDVI(){
        return new ComputerInterface(InterfaceName.DVI, InterfaceType.FEMALE);
    }

    public static ComputerInterface createVGA(){
        return new ComputerInterface(InterfaceName.VGA, InterfaceType.FEMALE);
    }

    public static ComputerInterface createPCI(){
        return new ComputerInterface(InterfaceName.PCI, InterfaceType.FEMALE);
    }

    public static ComputerInterface createPCIE(){
        return new ComputerInterface(InterfaceName.PCI, InterfaceType.FEMALE);
    }

    public static ComputerInterface createSATA(){
        return new ComputerInterface(InterfaceName.SATA, InterfaceType.FEMALE);
    }

    public static ComputerInterface createIDE(){
        return new ComputerInterface(InterfaceName.IDE, InterfaceType.FEMALE);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Interface Name: ").append(name).append("\n");
        builder.append("Interface Type: ").append(type).append("\n");
        builder.append("Is Broken: ").append(isBroken).append("\n");
        return builder.toString();
    }
}
