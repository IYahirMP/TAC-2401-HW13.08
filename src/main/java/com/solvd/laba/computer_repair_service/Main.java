package com.solvd.laba.computer_repair_service;

import com.solvd.laba.computer_repair_service.controllers.ServiceHandler;

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
