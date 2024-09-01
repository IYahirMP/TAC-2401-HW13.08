package com.solvd.laba.computer_repair_service.input.exception;

public class InvalidPhoneNumberException extends InvalidInputException {

    public InvalidPhoneNumberException() {
        super("Provided input is not a valid phone number.");
    }

    public InvalidPhoneNumberException(String message) {
        super(message);
    }
}
