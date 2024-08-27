package com.solvd.laba.computer_repair_service.input.visitors;

import com.solvd.laba.computer_repair_service.input.complex_input.CustomerInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.complex_input.OrderInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;

import java.util.Scanner;

public class RetrieveInputVisitor implements OperationInputVisitor {

    public RetrieveInputVisitor() {

    }

    public void visitInteger(IntegerInput integerInput){
        Scanner sc = new Scanner(System.in);
        integerInput.setValue(sc.nextInt());
    }

    public void visitString(StringInput stringInput){
        Scanner sc = new Scanner(System.in);
        stringInput.setValue(sc.nextLine());
    }

    public void visitOrder(OrderInput order){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void visitCustomer(CustomerInput customer){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
