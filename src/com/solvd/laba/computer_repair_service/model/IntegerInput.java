package com.solvd.laba.computer_repair_service.model;

import java.util.Scanner;

public class IntegerInput implements Input<Integer>{
    private int value;

    public IntegerInput() {
        super();
        value = 0;
    }

    public void retrieveInput(){
        Scanner sc = new Scanner(System.in);
        this.value = sc.nextInt();
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
