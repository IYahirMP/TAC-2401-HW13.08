package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;

import java.util.HashMap;

public class CreateOrderView extends FeedbackView{

    public CreateOrderView(HashMap<String, SingleInput<?>> inputs){
        super(inputs);
    }

    public CreateOrderView(){
        super(new HashMap<String, SingleInput<?>>());
    }

    public void display(){
        System.out.println("A new order is being placed for your service.");
    }

    public HashMap<String, SingleInput<?>> getInputs(){
        return inputs;
    }
}

