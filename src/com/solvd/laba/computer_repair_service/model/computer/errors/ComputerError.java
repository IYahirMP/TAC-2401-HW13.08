package com.solvd.laba.computer_repair_service.model.computer.errors;

public class ComputerError extends Exception{

    public ComputerError(){
        super();
    }

    public ComputerError(String error) {
        super(error);
    }

}
