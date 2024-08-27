package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.Input;
import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;

import java.util.HashMap;

public class CreateCustomerView extends FeedbackView{

    public CreateCustomerView(HashMap<String, SingleInput<?>> inputs){
        super(inputs);
    }

    public CreateCustomerView(){
        super(new HashMap<String, SingleInput<?>>());
    }

    public void display(){
        System.out.println("Register new customer.");
        System.out.println("Please, input the customer's data");
    }

    public HashMap<String, SingleInput<?>> getInputs(){
        String[] inputName = {
                "firstName",
                "lastName",
                "address",
                "email",
                "phoneNumber"
        };

        for (String name : inputName){
            SingleInput<String> currentInput = new StringInput();
            RetrieveInputVisitor visitor = new RetrieveInputVisitor();

            System.out.print(name + ": ");
            currentInput.accept(visitor);
            inputs.put(name, currentInput);
        }

        return inputs;
    }
}

