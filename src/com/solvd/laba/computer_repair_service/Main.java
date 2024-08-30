package com.solvd.laba.computer_repair_service;

import com.solvd.laba.computer_repair_service.controllers.ServiceHandler;
import com.solvd.laba.computer_repair_service.data_structures.LinkedList;
import com.solvd.laba.computer_repair_service.data_structures.LinkedListTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.LoggerContext;

import java.io.File;

public class Main {
    //private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args){
        /*LoggerContext context = (LoggerContext) LogManager.getContext(false);
        File file = new File("C:/Users/ivany/IdeaProjects/HW13.08/src/log4j2.xml");
        context.setConfigLocation(file.toURI());*/

        //logger.debug("Debug info");
        ServiceHandler service = new ServiceHandler();
        service.service();
        //LinkedListTest.test();
    }
}
