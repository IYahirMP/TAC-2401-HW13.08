package com.solvd.laba.computer_repair_service.input.exception;

public class InvalidNumberException extends InvalidInputException{
    public InvalidNumberException(){
        super("Given input is not a valid number");
    }

    public InvalidNumberException(String message) {
        super(message);
    }
}
