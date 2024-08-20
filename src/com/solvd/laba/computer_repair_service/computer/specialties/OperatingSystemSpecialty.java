package com.solvd.laba.computer_repair_service.computer.specialties;

import com.solvd.laba.computer_repair_service.computer.Computer;

import java.util.ArrayList;

abstract class OperatingSystemSpecialty implements Maintainer{
    public void correctiveMaintenance(Computer computer) {

    }

    public void preventiveMaintenance(Computer computer) {
        updateSystem();
        cleanCache();
    }

    public void diagnose(Computer computer){

    };

    public abstract void repairBoot();

    public abstract void repairSystem();

    public abstract void reinstallSystem();

    public abstract void updateSystem();

    public abstract void backupData();
    public abstract void restoreData();

    public abstract void cleanCache();
}
