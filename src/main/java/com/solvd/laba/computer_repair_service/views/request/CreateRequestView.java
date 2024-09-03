package com.solvd.laba.computer_repair_service.views.request;

import com.solvd.laba.computer_repair_service.Main;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.exception.InvalidInputException;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;
import com.solvd.laba.computer_repair_service.input.visitors.GetValueVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;
import com.solvd.laba.computer_repair_service.views.FeedbackView;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput.TypeOfString;

import java.util.HashMap;

public final class CreateRequestView extends FeedbackView {

    public CreateRequestView(HashMap<String, String> inputs){
        super(inputs);
    }

    public CreateRequestView(){
        super(new HashMap<>());
    }

    public void display(){
        System.out.println("Creating a new request.");
        System.out.println("Please, describe your request.");
    }

    public HashMap<String, String> getInputs(){
        StringInput[] inputNames = {
          new StringInput("description", "Description", TypeOfString.largeInput)
        };


        for (StringInput data : inputNames){
            boolean inputIsCorrect = false;
            String inputName = data.getName();
            String inputDisplayName = data.getDisplayName();
            TypeOfString inputType = data.getType();
            String currentValue = "";

            while (!inputIsCorrect) {
                System.out.print( inputDisplayName + ": ");
                try {
                    data.accept(new RetrieveInputVisitor());
                } catch (InvalidInputException e) {
                    Main.logger.error(e);
                    System.out.println(e.getMessage());
                    System.out.println("Please input a valid value.\n");
                    continue;
                }

                inputIsCorrect = true;
                currentValue = data.accept(new GetValueVisitor());
            }

            inputs.put(inputName, currentValue);
        }

        return inputs;
    }
}

