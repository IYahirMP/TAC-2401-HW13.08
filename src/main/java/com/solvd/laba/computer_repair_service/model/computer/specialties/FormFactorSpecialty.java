package com.solvd.laba.computer_repair_service.model.computer.specialties;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.FormFactor;

public abstract class FormFactorSpecialty implements Maintainer{

    protected FormFactor formFactor;

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

    public FormFactor getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(FormFactor formFactor) {
        this.formFactor = formFactor;
    }

    @Override
    public int hashCode(){
        return formFactor.hashCode();
    }
}
