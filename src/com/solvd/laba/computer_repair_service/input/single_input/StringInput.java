package com.solvd.laba.computer_repair_service.input.single_input;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.visitors.OperationInputVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

public class StringInput extends SingleInput<String> {

    public StringInput() {
        value = "";
    }

    public void accept(OperationInputVisitor visitor){
        visitor.visitString(this);
    }

    public String accept(ValueInputVisitor visitor){
        return visitor.visitString(this);
    }

}
