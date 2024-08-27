package com.solvd.laba.computer_repair_service.input;

import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

public interface SingleInput<T> extends Input{
    public T accept(ValueInputVisitor visitor);
    public T getValue();
    public void setValue(T value);
}
