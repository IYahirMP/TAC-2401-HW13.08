package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.StringInput;

import java.util.HashMap;

public class CreateRequestView extends FeedbackView{

    public CreateRequestView(HashMap<String, Input<?>> inputs){
        super(inputs);
    }

    public CreateRequestView(){
        super(new HashMap<String, Input<?>>());
    }

    public void display(){
        System.out.println("Creating a new request.");
        System.out.println("Please, describe your request.");
    }

    public HashMap<String, Input<?>> getInputs(){
        String[] inputName = {
                "Description"
        };

        for (String name : inputName){
            Input<String> currentInput = new StringInput();
            System.out.print(name + ": ");
            currentInput.retrieveInput();
            inputs.put(name, currentInput);
        }

        return inputs;
    }
}

