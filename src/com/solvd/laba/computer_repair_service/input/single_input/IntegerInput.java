package com.solvd.laba.computer_repair_service.input.single_input;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.visitors.OperationInputVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

public class IntegerInput implements SingleInput<Integer> {
    private int value;

    public IntegerInput() {
        value = 0;
    }

    public void accept(OperationInputVisitor visitor){
        visitor.visitInteger(this);
    }

    public Integer accept(ValueInputVisitor visitor){
        return visitor.visitInteger(this);
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
