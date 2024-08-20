package com.solvd.laba.computer_repair_service.computer.errors;

public class ComputerError {
    private String error;

    public ComputerError(){
        error = "";
    }

    public ComputerError(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @Override
    public String toString() {
        return error;
    }
}
