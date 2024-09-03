package com.solvd.laba.computer_repair_service.model.computer.specialties;

public final class WindowsSpecialty extends OperatingSystemSpecialty{

    public WindowsSpecialty() {
        operatingSystemName = "Windows";
    }

    public void repairBoot(){};

    public void repairSystem(){};

    public void reinstallSystem(){};

    public void updateSystem(){};

    public void backupData(){};

    public void restoreData(){};

    public void cleanCache(){};
}
