package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.Main;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.exception.InvalidInputException;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;
import com.solvd.laba.computer_repair_service.input.visitors.GetValueVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;

import java.util.HashMap;

public abstract class FeedbackView extends View {

    protected HashMap<String, String> inputs;

    public FeedbackView(HashMap<String, String> inputs) {
        super();
        this.inputs = inputs;
    }

    public abstract void display();

    public abstract HashMap<String, String> getInputs();

    public void processInputs(StringInput[] stringInputs){
        if (stringInputs == null){
            Main.logger.error("Array of StringInputs is null. NullPointerException thrown.");
            throw new NullPointerException("Array of StringInput is null");
        }

        for (StringInput data : stringInputs){
            boolean inputIsCorrect = false;
            String inputName = data.getName();
            String inputDisplayName = data.getDisplayName();
            StringInput.TypeOfString inputType = data.getType();
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
    }
}
