package com.solvd.laba.computer_repair_service.views;

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
