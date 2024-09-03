package com.solvd.laba.computer_repair_service.input.exception;

public class InvalidAddressException extends InvalidInputException{

    public InvalidAddressException() {
        super("Provided input is not a valid address\n");
    }

    public InvalidAddressException(String message) {
        super(message);
    }
}
