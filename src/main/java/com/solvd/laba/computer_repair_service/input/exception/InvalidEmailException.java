package com.solvd.laba.computer_repair_service.input.exception;

public class InvalidEmailException extends InvalidInputException {
    public InvalidEmailException() {
        super("Provided input is not a valid email");
    }

    public InvalidEmailException(String message) {
        super(message);
    }
}
