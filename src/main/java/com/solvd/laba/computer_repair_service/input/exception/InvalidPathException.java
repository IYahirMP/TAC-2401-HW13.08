package com.solvd.laba.computer_repair_service.input.exception;

public class InvalidPathException extends InvalidInputException {
    public InvalidPathException() {
        super("Provided value is not a valid path");
    }

    public InvalidPathException(String message) {
        super(message);
    }
}
