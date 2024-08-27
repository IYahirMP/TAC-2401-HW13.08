package com.solvd.laba.computer_repair_service.input;

import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

public abstract class SingleInput<T> implements Input{
    protected T value;

    public abstract String accept(ValueInputVisitor visitor);

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
