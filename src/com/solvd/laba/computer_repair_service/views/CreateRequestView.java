package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;

import java.util.HashMap;

public class CreateRequestView extends FeedbackView{

    public CreateRequestView(HashMap<String, SingleInput<?>> inputs){
        super(inputs);
    }

    public CreateRequestView(){
        super(new HashMap<String, SingleInput<?>>());
    }

    public void display(){
        System.out.println("Creating a new request.");
        System.out.println("Please, describe your request.");
    }

    public HashMap<String, SingleInput<?>> getInputs(){
        String[] inputName = {
                "Description"
        };

        for (String name : inputName){
            SingleInput<String> currentInput = new StringInput();
            System.out.print(name + ": ");
            currentInput.accept(new RetrieveInputVisitor());
            inputs.put(name, currentInput);
        }

        return inputs;
    }
}

