package com.solvd.laba.computer_repair_service.model.computer.specialties;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.OperatingSystem;

import java.util.ArrayList;

public abstract class OperatingSystemSpecialty implements Maintainer{
    protected OperatingSystem operatingSystem;

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

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    @Override
    public int hashCode(){
        return operatingSystem.hashCode();
    }
}
