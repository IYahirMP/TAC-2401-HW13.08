package com.solvd.laba.computer_repair_service;

import com.solvd.laba.computer_repair_service.controllers.ServiceHandler;

public class Main {
    public static void main(String[] args){
        ServiceHandler service = new ServiceHandler();
        service.service();
    }
}
