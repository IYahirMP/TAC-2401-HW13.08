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
        System.out.println("Register new customer.");
    }

    public HashMap<String, Input<?>> getInputs(){
        String[] inputName = {
                "firstName",
                "lastName",
                "address",
                "email",
                "phoneNumber"
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

