package com.solvd.laba.computer_repair_service.model.computer.specialties;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.FormFactor;
import com.solvd.laba.computer_repair_service.model.service_management.Fault;

import java.util.ArrayList;

public abstract class FormFactorSpecialty implements Maintainer{

    protected FormFactor formFactor;

    public void correctiveMaintenance(Computer computer) {

    }

    public void preventiveMaintenance(Computer computer) {

    }

    public void diagnose(Computer computer){
        ArrayList<Fault> faults = new ArrayList<>();
        
        faults.addAll(checkInterfaces(computer));
        faults.addAll(checkProcessor(computer));
        faults.addAll(checkIntegratedGPU(computer));
        faults.addAll(checkCoolingSystem(computer));
        faults.addAll(checkHDD(computer));
        faults.addAll(checkSSD(computer));
        faults.addAll(checkDiscreteGPU(computer));
        faults.addAll(checkBluetoothAdapter(computer));
        faults.addAll(checkRAM(computer));
        faults.addAll(checkWiFiAdapter(computer));
        faults.addAll(checkMotherboard(computer));
    };

    public abstract ArrayList<Fault> checkInterfaces(Computer computer);

    public abstract ArrayList<Fault> openCase(Computer computer);

    public abstract ArrayList<Fault> closeCase(Computer computer);

    public abstract ArrayList<Fault> checkRAM(Computer computer);

    public abstract ArrayList<Fault> checkDiscreteGPU(Computer computer);

    public abstract ArrayList<Fault> checkIntegratedGPU(Computer computer);

    public abstract ArrayList<Fault> checkCoolingSystem(Computer computer);

    public abstract ArrayList<Fault> checkProcessor(Computer computer);

    public abstract ArrayList<Fault> checkMotherboard(Computer computer);

    public abstract ArrayList<Fault> checkWiFiAdapter(Computer computer);

    public abstract ArrayList<Fault> checkBluetoothAdapter(Computer computer);

    public abstract ArrayList<Fault> checkHDD(Computer computer);

    public abstract ArrayList<Fault> checkSSD(Computer computer);

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
