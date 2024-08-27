package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;

import java.util.HashMap;

public class CreateComputerView extends FeedbackView{

    public CreateComputerView(HashMap<String, SingleInput<?>> inputs){
        super(inputs);
    }

    public CreateComputerView(){
        super(new HashMap<String, SingleInput<?>>());
    }

    public void display(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public HashMap<String, SingleInput<?>> getInputs(){
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

