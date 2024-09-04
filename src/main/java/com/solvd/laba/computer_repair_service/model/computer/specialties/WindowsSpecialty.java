package com.solvd.laba.computer_repair_service.model.computer.specialties;

import com.solvd.laba.computer_repair_service.model.computer.OperatingSystem;

public final class WindowsSpecialty extends OperatingSystemSpecialty{

    public WindowsSpecialty() {
        operatingSystem = OperatingSystem.WINDOWS;
    }

    public void repairBoot(){};

    public void repairSystem(){};

    public void reinstallSystem(){};

    public void updateSystem(){};

    public void backupData(){};

    public void restoreData(){};

    public void cleanCache(){};
}
