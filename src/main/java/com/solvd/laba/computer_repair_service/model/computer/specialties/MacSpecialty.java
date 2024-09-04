package com.solvd.laba.computer_repair_service.model.computer.specialties;

import com.solvd.laba.computer_repair_service.model.computer.OperatingSystem;

public final class MacSpecialty extends OperatingSystemSpecialty{

    public MacSpecialty(){
        operatingSystem = OperatingSystem.MAC;
    }

    public void repairBoot(){};

    public void repairSystem(){};

    public void reinstallSystem(){};

    public void updateSystem(){};

    public void backupData(){};

    public void restoreData(){};

    public void cleanCache(){};
}
