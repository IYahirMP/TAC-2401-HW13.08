package com.solvd.laba.computer_repair_service.input.single_input;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.visitors.OperationInputVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

public class IntegerInput extends SingleInput<Integer> {

    public IntegerInput() {
        value = 0;
    }

    public void accept(OperationInputVisitor visitor){
        visitor.visitInteger(this);
    }

    public String accept(ValueInputVisitor visitor){
        return visitor.visitInteger(this);
    }

}
