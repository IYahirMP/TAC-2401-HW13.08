package com.solvd.laba.computer_repair_service.model.computer.specialties;
import com.solvd.laba.computer_repair_service.model.computer.Computer;

public interface Maintainer {
    public void preventiveMaintenance(Computer computer);
    public void correctiveMaintenance(Computer computer);
    public void diagnose(Computer computer);
}
