package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.model.Input;

import java.util.HashMap;

public abstract class FeedbackView extends View {

    protected HashMap<String, Input<?>> inputs;

    public FeedbackView(HashMap<String, Input<?>> inputs) {
        super();
        this.inputs = inputs;
    }

    public abstract void display();

    public abstract HashMap<String, Input<?>> getInputs();
}
