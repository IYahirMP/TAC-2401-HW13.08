package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.model.Input;
import com.solvd.laba.computer_repair_service.model.IntegerInput;
import com.solvd.laba.computer_repair_service.model.StringInput;

import java.util.HashMap;

public class CreateTaskView extends FeedbackView{

    public CreateTaskView(HashMap<String, Input<?>> inputs){
        super(inputs);
    }

    public CreateTaskView(){
        super(new HashMap<String, Input<?>>());
    }

    public void display(){
        System.out.println("Creating a new task.");
        System.out.println("How can we help you?.");
        System.out.println("\t1) I want a diagnose");
        System.out.println("\t2) My computer needs maintenance");
        System.out.println("\t3) Screen won't work properly");
        System.out.println("\t4) Computer won't boot");
        System.out.println("\t5) Keyboard won't work properly");
        System.out.println("\t6) Mouse won't work properly");
        System.out.println("\t7) Battery doesn't last / Computer won't work without charger");
        System.out.println("\t8) Computer heats up too much");
        System.out.println("\t9) Computer makes strange sound");
    }

    public HashMap<String, Input<?>> getInputs(){
        String[] inputName = {
                "choice"
        };

        for (String name : inputName){
            Input<Integer> currentInput = new IntegerInput();
            System.out.print(name + ": ");
            currentInput.retrieveInput();
            inputs.put(name, currentInput);
        }

        return inputs;
    }
}

