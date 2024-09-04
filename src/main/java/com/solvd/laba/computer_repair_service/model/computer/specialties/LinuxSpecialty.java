package com.solvd.laba.computer_repair_service.model.computer.specialties;

import com.solvd.laba.computer_repair_service.model.computer.OperatingSystem;

public final class LinuxSpecialty extends OperatingSystemSpecialty{

    public LinuxSpecialty() {
        operatingSystem = OperatingSystem.LINUX;
    }

    public void repairBoot(){};

    public void repairSystem(){};

    public void reinstallSystem(){};

    public void updateSystem(){};

    public void backupData(){};

    public void restoreData(){};

    public void cleanCache(){};
}
