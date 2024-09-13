package com.solvd.laba.computer_repair_service.input.single_input;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.visitors.OperationInputVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

public class StringInput extends SingleInput<String> {
    public enum TypeOfString {
        ADDRESS("\\d{1,5},[a-zA-Z ]{4,15},[a-zA-Z ]{4,25},[a-zA-Z ]{3,25}"),
        NAME("([A-Z])([a-zA-Z ]{2,15})"),
        EMAIL("\\S+@\\S+\\.\\S+"),
        PHONE("[0-9]{10}"),
        LARGE_INPUT("\\S{15,}"),
        FILE_PATH("\"{0,1}[A-Z]:([/\\\\][a-zA-Z0-9.,_-]{2,30})+.[a-zA-Z]{2,15}\"{0,1}"),
        NONE("[\\s\\S]+"),
        NUMBER("[0-9]+"),
        WORD("[a-zA-Z]+");

        private String regex;
        private TypeOfString(String regex) {
            this.regex = regex;
        }

        public String getRegex(){
            return regex;
        }
    }
    private TypeOfString type;

    public StringInput() {
        super();
        type = TypeOfString.NONE;
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
