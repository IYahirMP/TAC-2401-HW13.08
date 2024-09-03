package com.solvd.laba.computer_repair_service.input;

import com.solvd.laba.computer_repair_service.input.visitors.OperationInputVisitor;
import com.solvd.laba.computer_repair_service.input.visitors.ValueInputVisitor;

public interface Input {
    public void accept(OperationInputVisitor visitor);
}
