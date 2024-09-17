package com.solvd.laba.computer_repair_service.model.computer.specialties;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.FormFactor;
import com.solvd.laba.computer_repair_service.model.service_management.Fault;

import java.util.ArrayList;

public final class DesktopSpecialty extends FormFactorSpecialty{

    public DesktopSpecialty() {
        formFactor = FormFactor.DESKTOP;
    }

    public ArrayList<Fault> checkInterfaces(Computer computer){
        return new ArrayList<>();
    }

    public ArrayList<Fault> openCase(Computer computer) {
        return new ArrayList<>();
    }

    public ArrayList<Fault> closeCase(Computer computer) {
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkRAM(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkDiscreteGPU(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkIntegratedGPU(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkCPU(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkCoolingSystem(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkProcessor(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkMotherboard(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkWiFiAdapter(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkBluetoothAdapter(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkHDD(Computer computer){
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkSSD(Computer computer){
        return new ArrayList<>();

    }
}
