package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.SingleInput;

import java.util.HashMap;

public abstract class FeedbackView extends View {

    protected HashMap<String, String> inputs;

    public FeedbackView(HashMap<String, String> inputs) {
        super();
        this.inputs = inputs;
    }

    public abstract void display();

    public abstract HashMap<String, String> getInputs();
}
