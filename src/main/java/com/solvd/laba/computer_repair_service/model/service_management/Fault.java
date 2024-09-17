package com.solvd.laba.computer_repair_service.model.service_management;

import com.solvd.laba.computer_repair_service.model.computer.hardware.Hardware;

public class Fault {

    public enum FaultType{
        OVERHEAT,
        N0_SIGNAL,
        BROKEN
    }
    private String fault;
    private FaultType faultType;
    private String hardwareType;

    public Fault(String fault, FaultType faultType, String hardwareType) {
        this.fault = fault;
        this.faultType = faultType;
        this.hardwareType = hardwareType;
    }
}