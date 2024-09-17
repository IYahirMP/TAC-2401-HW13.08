package com.solvd.laba.computer_repair_service.model.computer.specialties;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.FormFactor;
import com.solvd.laba.computer_repair_service.model.computer.hardware.ComputerInterface;
import com.solvd.laba.computer_repair_service.model.computer.hardware.Motherboard;
import com.solvd.laba.computer_repair_service.model.computer.hardware.RAM;
import com.solvd.laba.computer_repair_service.model.service_management.Fault;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public final class LaptopSpecialty extends FormFactorSpecialty{

    //This was used at first
    private BiConsumer<ComputerInterface, ArrayList<Fault>> interfaceConsumer = (i, arr) -> {
        boolean isBroken = i.isBroken();
        if(isBroken){
            arr.add(new Fault(
                    "Interface " + i.toString() + " is broken",
                    Fault.FaultType.BROKEN,
                    ComputerInterface.class.getTypeName()));
        }

        String s = String.format("The interface %s is %s",
                i.getName(),
                isBroken ? "broken" : "not broken");

        System.out.println(s);
    };

    //Used for stream().peek()
    private Consumer<ComputerInterface> printInterfaceState = (i) -> {
        String s = String.format("The interface %s is %s",
                i.getName(),
                i.isBroken() ? "broken" : "not broken");

        System.out.println(s);
    };

    //Used for stream().map()
    private Function<ComputerInterface, Fault> faultCreator = (i) -> {
       return new Fault(
                "Interface " + i.toString() + " is broken",
                Fault.FaultType.BROKEN,
                ComputerInterface.class.getTypeName());
    };


    public LaptopSpecialty() {
        formFactor = FormFactor.LAPTOP;
    }

    public ArrayList<Fault> openCase(Computer computer) {
        System.out.println("Unscrewing the laptop");
        System.out.println("Placing extracted screws in a secure box");
        System.out.println("Opening the case gently with a sharp tool");
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkInterfaces(Computer computer) {
        System.out.println("Accessing motherboard");
        ArrayList<ComputerInterface> interfaces = computer.getMotherboard().getInterfaces();
        ArrayList<Fault> faults = new ArrayList<>();

        faults = interfaces.stream()
                .peek(printInterfaceState)
                .filter(ComputerInterface::isBroken)
                .map(faultCreator)
                .collect(Collectors.toCollection(ArrayList::new));


        //interfaces.forEach((computerInterface) -> interfaceConsumer.accept(computerInterface, faults));

        return faults;

    }

    public ArrayList<Fault> closeCase(Computer computer) {
        return new ArrayList<>();

    }

    public ArrayList<Fault> checkRAM(Computer computer){
        ArrayList<RAM> rams = computer.getRam().toArrayList();
        ArrayList<Fault> faults = new ArrayList<>();

        for(RAM r : rams){
            if (!r.isWorkingProperly()){
                faults.add(new Fault(
                        "RAM is not working properly.",
                        Fault.FaultType.BROKEN,
                        RAM.class.getTypeName()
                ));
            }
        }
        return faults;

    }

    public ArrayList<Fault> checkDiscreteGPU(Computer computer){
        ArrayList<ComputerInterface> outputPorts = computer.getDiscreteGPU().getOutputPorts().toArrayList();
        ArrayList<Fault> faults = new ArrayList<>();

        outputPorts.forEach((computerInterface) -> interfaceConsumer.accept(computerInterface, faults));


        return faults;
    }

    public ArrayList<Fault> checkIntegratedGPU(Computer computer){
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
