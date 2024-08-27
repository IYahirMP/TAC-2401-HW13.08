package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;

import java.util.HashMap;

public abstract class FeedbackView extends View {

    protected HashMap<String, SingleInput<?>> inputs;

    public FeedbackView(HashMap<String, SingleInput<?>> inputs) {
        super();
        this.inputs = inputs;
    }

    public abstract void display();

    public abstract HashMap<String, SingleInput<?>> getInputs();
}
