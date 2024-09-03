package com.solvd.laba.computer_repair_service.views.task;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.visitors.GetValueVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;
import com.solvd.laba.computer_repair_service.views.FeedbackView;

import java.util.HashMap;

public final class CreateTaskView extends FeedbackView {

    public CreateTaskView(HashMap<String, String> inputs){
        super(inputs);
    }

    public CreateTaskView(){
        super(new HashMap<>());
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

    public HashMap<String, String> getInputs(){
        String[] inputName = {
                "choice"
        };

        for (String name : inputName){
            SingleInput<Integer> currentInput = new IntegerInput();
            System.out.print(name + ": ");

            currentInput.accept(new RetrieveInputVisitor());
            String currentValue = currentInput.accept(new GetValueVisitor());

            inputs.put(name, currentValue);
        }

        return inputs;
    }
}

