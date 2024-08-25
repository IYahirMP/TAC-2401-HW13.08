package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.IntegerInput;
import com.solvd.laba.computer_repair_service.model.StringInput;
import com.solvd.laba.computer_repair_service.model.accounting.Order;

import java.util.HashMap;

public class ShowOrderDetailsView extends FeedbackView{

    public ShowOrderDetailsView(HashMap<String, Input<?>> inputs){
        super(inputs);
    }

    public ShowOrderDetailsView(){
        super(new HashMap<String, Input<?>>());
    }

    public void display(){
        System.out.println("These are the details for your order:");
        System.out.println((Order) displayData.get("order"));
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

