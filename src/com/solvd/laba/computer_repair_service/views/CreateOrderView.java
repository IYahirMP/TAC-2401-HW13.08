package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.SingleInput;

import java.util.HashMap;

public final class CreateOrderView extends FeedbackView{

    public CreateOrderView(HashMap<String, String> inputs){
        super(inputs);
    }

    public CreateOrderView(){
        super(new HashMap<>());
    }

    public void display(){
        System.out.println("A new order is being placed for your service.");
    }

    public HashMap<String, String> getInputs(){
        return inputs;
    }
}

