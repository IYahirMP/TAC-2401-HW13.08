package com.solvd.laba.computer_repair_service.input.complex_input;

import com.solvd.laba.computer_repair_service.input.ComplexInput;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.visitors.OperationInputVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

import java.util.HashMap;

public class OrderInput extends ComplexInput {

    public OrderInput() {
        super();
    }

    public void accept(OperationInputVisitor visitor){
        visitor.visitOrder(this);
    }

    public HashMap<String, SingleInput<?>> accept(ValueInputVisitor visitor){
        return visitor.visitOrder(this);
    }

}
