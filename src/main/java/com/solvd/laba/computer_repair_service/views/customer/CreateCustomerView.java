package com.solvd.laba.computer_repair_service.views.customer;

import com.solvd.laba.computer_repair_service.Main;
import com.solvd.laba.computer_repair_service.input.exception.*;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;
import com.solvd.laba.computer_repair_service.input.visitors.GetValueVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.RetrieveInputVisitor;
import com.solvd.laba.computer_repair_service.views.FeedbackView;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput.TypeOfString;

import java.util.HashMap;

public final class CreateCustomerView extends FeedbackView {

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
        StringInput[] stringInputs = {
                new StringInput("firstName",   "First name", TypeOfString.name),
                new StringInput("lastName",   "Last name", TypeOfString.name),
                new StringInput("address", "Address", TypeOfString.address),
                new StringInput("email", "Email", TypeOfString.email),
                new StringInput("phoneNumber", "Phone number", TypeOfString.phone),
        };

        processInputs(stringInputs);

        return inputs;
    }

}

