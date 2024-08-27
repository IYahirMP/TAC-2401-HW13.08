package com.solvd.laba.computer_repair_service.views;

import com.solvd.laba.computer_repair_service.input.SingleInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;
import com.solvd.laba.computer_repair_service.input.visitors.GetValueVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;

import java.util.HashMap;

public final class CreateCustomerView extends FeedbackView{

    public CreateCustomerView(HashMap<String, String> inputs){
        super(inputs);
    }

    public CreateCustomerView(){
        super(new HashMap<>());
    }

    public void display(){
        System.out.println("Register new customer.");
        System.out.println("Please, input the customer's data");
    }

    public HashMap<String, String> getInputs(){
        String[] inputName = {
                "firstName",
                "lastName",
                "address",
                "email",
                "phoneNumber"
        };

        for (String name : inputName){
            SingleInput<String> currentInput = new StringInput();

            System.out.print(name + ": ");
            currentInput.accept(new RetrieveInputVisitor());

            String currentValue = currentInput.accept(new GetValueVisitor());
            inputs.put(name, currentValue);
        }

        return inputs;
    }
}

