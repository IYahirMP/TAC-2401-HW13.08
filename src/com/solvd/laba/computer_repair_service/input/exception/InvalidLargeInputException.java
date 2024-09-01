package com.solvd.laba.computer_repair_service.input.exception;

public class InvalidLargeInputException extends InvalidInputException{

    public InvalidLargeInputException() {
        super("Provided input is not a valid large input.\n");
    }

    public InvalidLargeInputException(String message) {
        super(message);
    }

}
