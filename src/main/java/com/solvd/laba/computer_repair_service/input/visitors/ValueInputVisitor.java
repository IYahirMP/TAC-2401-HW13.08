package com.solvd.laba.computer_repair_service.input.visitors;

import com.solvd.laba.computer_repair_service.input.*;
import com.solvd.laba.computer_repair_service.input.complex_input.CustomerInput;
import com.solvd.laba.computer_repair_service.input.complex_input.OrderInput;
import com.solvd.laba.computer_repair_service.input.single_input.IntegerInput;
import com.solvd.laba.computer_repair_service.input.single_input.StringInput;

import java.util.HashMap;

public interface ValueInputVisitor {
    String visitInteger(IntegerInput input);
    String visitString(StringInput input);
    HashMap<String, SingleInput<String>> visitOrder(OrderInput input);
    HashMap<String, SingleInput<String>> visitCustomer(CustomerInput input);
}
