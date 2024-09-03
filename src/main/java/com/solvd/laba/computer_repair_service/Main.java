package com.solvd.laba.computer_repair_service;

import com.solvd.laba.computer_repair_service.controllers.ServiceHandler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args){

        ServiceHandler service = new ServiceHandler();
        logger.trace("Service handler has been created");
        service.service();
    }
}
