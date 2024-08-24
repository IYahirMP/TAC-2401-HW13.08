package com.solvd.laba.computer_repair_service.model;

import java.util.Scanner;

public class StringInput implements Input<String>{
    private String value;

    public StringInput() {
        value = "";
    }

    public void retrieveInput(){
        Scanner sc = new Scanner(System.in);
        this.value = sc.nextLine();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
