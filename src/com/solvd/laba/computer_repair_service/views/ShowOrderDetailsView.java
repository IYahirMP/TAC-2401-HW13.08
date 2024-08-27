package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.model.accounting.Order;

import java.util.HashMap;

public class ShowOrderDetailsView extends FeedbackView{

    public ShowOrderDetailsView(HashMap<String, SingleInput<?>> inputs){
        super(inputs);
    }

    public ShowOrderDetailsView(){
        super(new HashMap<String, SingleInput<?>>());
    }

    public void display(){
        System.out.println("These are the details for your order:");
        System.out.println((Order) displayData.get("order"));
    }

    public HashMap<String, SingleInput<?>> getInputs(){

        return inputs;
    }
}

