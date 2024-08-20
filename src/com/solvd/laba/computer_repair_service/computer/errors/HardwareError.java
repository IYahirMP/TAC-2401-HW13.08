package com.solvd.laba.computer_repair_service.computer.errors;

import com.solvd.laba.computer_repair_service.computer.hardware.Hardware;

public class HardwareError extends ComputerError{
    Hardware source;

    public HardwareError(Hardware source) {
        this.source = source;
    }
}
