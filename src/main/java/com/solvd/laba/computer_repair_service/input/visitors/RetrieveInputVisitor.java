package com.solvd.laba.computer_repair_service.input.visitors;

import com.solvd.laba.computer_repair_service.input.complex_input.CustomerInput;
import com.solvd.laba.computer_repair_service.input.exception.*;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.complex_input.OrderInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;

import java.util.InputMismatchException;
import java.util.Scanner;

public final class RetrieveInputVisitor implements OperationInputVisitor {

    public RetrieveInputVisitor() {

    }

    public void visitInteger(IntegerInput integerInput){
        Scanner sc = new Scanner(System.in);
        integerInput.setValue(sc.nextInt());
    }

    public void visitString(StringInput stringInput)
        throws InvalidAddressException,
            InvalidNameException,
            InvalidPhoneNumberException,
            InvalidEmailException,
            InvalidLargeInputException
    {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        switch(stringInput.getType()){
            case none -> {}
            case address -> {
                if(!input.matches("\\d{1,5},[a-zA-Z ]{4,15},[a-zA-Z ]{4,25},[a-zA-Z ]{3,25}")){
                    throw new InvalidAddressException(
                            "A valid address should not contain any blank spaces.\n" +
                            "Example: 1234, StreetName, CityName, StateName");
                }
            }
            case name -> {
                if(!input.matches("([A-Z])([a-zA-Z ]{2,15})")){
                    throw new InvalidNameException(
                            "A valid name should begin with uppercase letter (A-Z), be at least 3 letters and a maximum of 16.\n" +
                            "Example: Antonio");
                }
            }
            case phone -> {
                if(!input.matches("[0-9]{10}")){
                    throw new InvalidPhoneNumberException(
                            "A valid phone should be a number containing exactly 10 digits\n"
                            + "Example: 123456789"
                    );
                }
            }
            case email -> {
                if(!input.matches("\\S+@\\S+\\.\\S+")){
                    throw new InvalidEmailException(
                            "A valid email address should contain a sequence of characters similar to name@domain.com\n"
                    );
                }
            }
            case largeInput -> {
                if (!input.matches("\\S{15,}")) {
                    throw new InvalidLargeInputException(
                            "Input is too short"
                    );
                }
            }
        };
        stringInput.setValue(input);
    }

    public void visitOrder(OrderInput order){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void visitCustomer(CustomerInput customer){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
