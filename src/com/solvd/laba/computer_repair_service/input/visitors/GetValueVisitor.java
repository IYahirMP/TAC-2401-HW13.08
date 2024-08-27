package com.solvd.laba.computer_repair_service.input.visitors;

import com.solvd.laba.computer_repair_service.input.*;
import com.solvd.laba.computer_repair_service.input.complex_input.CustomerInput;
import com.solvd.laba.computer_repair_service.input.complex_input.OrderInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;

import java.util.HashMap;

public class GetValueVisitor implements ValueInputVisitor {
    public Integer visitInteger(IntegerInput integerInput){
        return integerInput.getValue();
    }

    public String visitString(StringInput stringInput){
        return stringInput.getValue();
    }

    public HashMap<String, SingleInput<?>> visitOrder(OrderInput order){
        return order.getValues();
    }

    public HashMap<String, SingleInput<?>> visitCustomer(CustomerInput customer){
        return customer.getValues();
    }
}
