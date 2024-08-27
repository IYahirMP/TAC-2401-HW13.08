package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.model.accounting.Order;

import java.util.HashMap;

public final class ShowOrderDetailsView extends FeedbackView{

    public ShowOrderDetailsView(HashMap<String, String> inputs){
        super(inputs);
    }

    public ShowOrderDetailsView(){
        super(new HashMap<>());
    }

    public void display(){
        System.out.println("These are the details for your order:");
        System.out.println((Order) displayData.get("order"));
    }

    public HashMap<String, String> getInputs(){

        return inputs;
    }
}

