package com.solvd.laba.computer_repair_service.computer.specialties;

import com.solvd.laba.computer_repair_service.computer.Computer;

public abstract class FormFactorSpecialty implements Maintainer{

    public void correctiveMaintenance(Computer computer) {

    }

    public void preventiveMaintenance(Computer computer) {

    }

    public void diagnose(Computer computer){

    };

    public abstract void openCase(Computer computer);

    public abstract void closeCase(Computer computer);

    public abstract void checkRAM(Computer computer);

    public abstract void checkDiscreteGPU(Computer computer);

    public abstract void checkIntegratedGPU(Computer computer);

    public abstract void checkCPU(Computer computer);

    public abstract void checkCoolingSystem(Computer computer);

    public abstract void checkProcessor(Computer computer);

    public abstract void checkMotherboard(Computer computer);

    public abstract void checkWiFiAdapter(Computer computer);

    public abstract void checkBluetoothAdapter(Computer computer);

    public abstract void checkHDD(Computer computer);

    public abstract void checkSSD(Computer computer);
}
