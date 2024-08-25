package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.IntegerInput;
import com.solvd.laba.computer_repair_service.model.StringInput;

import java.util.HashMap;

public class CreateOrderView extends FeedbackView{

    public CreateOrderView(HashMap<String, Input<?>> inputs){
        super(inputs);
    }

    public CreateOrderView(){
        super(new HashMap<String, Input<?>>());
    }

    public void display(){
        System.out.println("A new order is being placed for your service.");
    }

    public HashMap<String, Input<?>> getInputs(){
        /*String[] inputName = {
                "choice"
        };

        for (String name : inputName){
            Input<Integer> currentInput = new IntegerInput();
            System.out.print(name + ": ");
            currentInput.retrieveInput();
            inputs.put(name, currentInput);
        }*/

        return inputs;
    }
}

