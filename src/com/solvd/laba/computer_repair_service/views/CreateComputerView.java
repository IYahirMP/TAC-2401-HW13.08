package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.SingleInput;

import java.util.HashMap;

public final class CreateComputerView extends FeedbackView{

    public CreateComputerView(HashMap<String, String> inputs){
        super(inputs);
    }

    public CreateComputerView(){
        super(new HashMap<>());
    }

    public void display(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public HashMap<String, String> getInputs(){
        throw new UnsupportedOperationException("Not supported yet.");

    }
}

