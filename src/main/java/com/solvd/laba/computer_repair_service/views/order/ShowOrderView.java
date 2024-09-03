package com.solvd.laba.computer_repair_service.views.order;

import com.solvd.laba.computer_repair_service.model.accounting.Order;
import com.solvd.laba.computer_repair_service.views.FeedbackView;

import java.util.HashMap;

public final class ShowOrderView extends FeedbackView {

    public ShowOrderView(HashMap<String, String> inputs){
        super(inputs);
    }

    public ShowOrderView(){
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

