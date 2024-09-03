package com.solvd.laba.computer_repair_service.input.visitors;

import com.solvd.laba.computer_repair_service.input.*;
import com.solvd.laba.computer_repair_service.input.complex_input.CustomerInput;
import com.solvd.laba.computer_repair_service.input.complex_input.OrderInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;

import java.util.HashMap;

public final class GetValueVisitor implements ValueInputVisitor {
    public String visitInteger(IntegerInput integerInput){
        return integerInput.getValue().toString();
    }

    public String visitString(StringInput stringInput){
        return stringInput.getValue();
    }

    public HashMap<String, SingleInput<String>> visitOrder(OrderInput order){
        return order.getValues();
    }

    public HashMap<String, SingleInput<String>> visitCustomer(CustomerInput customer){
        return customer.getValues();
    }
}
