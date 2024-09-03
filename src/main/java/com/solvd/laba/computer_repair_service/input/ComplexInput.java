package com.solvd.laba.computer_repair_service.input;

import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

import java.util.HashMap;

public abstract class ComplexInput implements Input {
    protected HashMap<String, SingleInput<String>> values;

    public abstract HashMap<String, SingleInput<String>> accept(ValueInputVisitor visitor);

    public HashMap<String, SingleInput<String>> getValues() {
        return values;
    }

    public void setValues(HashMap<String, SingleInput<String>> values) {
        this.values = values;
    }
}
