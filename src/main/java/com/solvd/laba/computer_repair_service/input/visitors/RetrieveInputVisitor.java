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
        String input = "";
        switch(stringInput.getType()){
            case NONE -> {
                StringBuilder sb = new StringBuilder();
                while(sc.hasNextLine()){
                    String line = sc.nextLine();
                    if (line.isEmpty()){
                        break;
                    }
                    sb.append(line + "\n");
                }
                input = sb.toString();
            }
            case ADDRESS -> {
                input = sc.nextLine();
                if(!input.matches(StringInput.TypeOfString.ADDRESS.getRegex())){
                    throw new InvalidAddressException(
                            "A valid address should not contain any blank spaces.\n" +
                            "Example: 1234, StreetName, CityName, StateName");
                }
            }
            case NAME -> {
                input = sc.nextLine();
                if(!input.matches(StringInput.TypeOfString.NAME.getRegex())){
                    throw new InvalidNameException(
                            "A valid name should begin with uppercase letter (A-Z), be at least 3 letters and a maximum of 16.\n" +
                            "Example: Antonio");
                }
            }
            case PHONE -> {
                input = sc.nextLine();
                if(!input.matches(StringInput.TypeOfString.PHONE.getRegex())){
                    throw new InvalidPhoneNumberException(
                            "A valid phone should be a number containing exactly 10 digits\n"
                            + "Example: 123456789"
                    );
                }
            }
            case EMAIL -> {
                input = sc.nextLine();
                if(!input.matches(StringInput.TypeOfString.EMAIL.getRegex())){
                    throw new InvalidEmailException(
                            "A valid email address should contain a sequence of characters similar to name@domain.com\n"
                    );
                }
            }
            case LARGE_INPUT -> {
                input = sc.nextLine();
                if (!input.matches(StringInput.TypeOfString.LARGE_INPUT.getRegex())) {
                    throw new InvalidLargeInputException(
                            "Input is too short"
                    );
                }
            }
            case FILE_PATH -> {
                input = sc.nextLine();
                if(!input.matches(StringInput.TypeOfString.FILE_PATH.getRegex())){
                    throw new InvalidPathException(
                            "A path should follow the next format: <Letter>:/folder1/folder2/<more folders>/file.extension"
                    );
                }
            }
            case NUMBER -> {
                input = sc.nextLine();
                if(!input.matches(StringInput.TypeOfString.NUMBER.getRegex())){
                    throw new InvalidNumberException(
                            "A valid number should only contain characters ranging from 0 to 9."
                    );
                }
            }
            case WORD -> {
                input = sc.nextLine();
                if(!input.matches(StringInput.TypeOfString.WORD.getRegex())){
                    throw new InvalidWordException(
                            "A valid word should only contain alphabetic characters."
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
