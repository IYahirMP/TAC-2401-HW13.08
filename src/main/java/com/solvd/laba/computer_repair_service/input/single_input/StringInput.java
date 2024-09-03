package com.solvd.laba.computer_repair_service.input.single_input;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.visitors.OperationInputVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

public class StringInput extends SingleInput<String> {
    public enum TypeOfString {address, name, email, phone, largeInput, none}
    private TypeOfString type;

    public StringInput() {
        super();
        type = TypeOfString.none;
    }

    public StringInput(String name, String displayName, TypeOfString type) {
        super(name, displayName);
        this.type = type;
    }

    public void accept(OperationInputVisitor visitor){
        visitor.visitString(this);
    }

    public String accept(ValueInputVisitor visitor){
        return visitor.visitString(this);
    }

    public TypeOfString getType() {
        return type;
    }

    public void setType(TypeOfString type) {
        this.type = type;
    }

}
