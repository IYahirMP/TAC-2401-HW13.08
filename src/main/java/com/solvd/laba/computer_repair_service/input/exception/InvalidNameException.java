package com.solvd.laba.computer_repair_service.input.exception;

public class InvalidNameException extends InvalidInputException{

    public InvalidNameException() {
        super("Provided input is not a valid name\n");
    }

    public InvalidNameException(String message) {
        super(message);
    }
}
