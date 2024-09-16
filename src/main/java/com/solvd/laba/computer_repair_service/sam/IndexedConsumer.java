package com.solvd.laba.computer_repair_service.sam;

public interface IndexedConsumer <T> {
    public void accept(int index, T t);
}
