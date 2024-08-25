package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.model.Input;

import java.util.HashMap;

public abstract class View
{
    protected HashMap<String, Object> displayData;

    public View(){
        displayData = new HashMap<>();
    }

    public abstract void display();

    public void setInputs(HashMap<String, Object> inputs){
        displayData = inputs;
    }
}
