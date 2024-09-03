package com.solvd.laba.computer_repair_service.input.visitors;

import com.solvd.laba.computer_repair_service.input.complex_input.CustomerInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.complex_input.OrderInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;


public interface OperationInputVisitor {
    void visitInteger (IntegerInput integerInput);
    void visitString (StringInput stringInput);
    void visitOrder (OrderInput order);
    void visitCustomer (CustomerInput customer);
}
