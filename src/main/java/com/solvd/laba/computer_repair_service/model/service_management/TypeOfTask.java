package com.solvd.laba.computer_repair_service.model.service_management;

public enum TypeOfTask {
    MAINTENANCE("Preventive maintenance", 0),
    REPAIR("Repair device", 0),
    FIX_BAD_KEYBOARD("Keyboard is working incorrectly or not working at all.", 0),
    FIX_BAD_MOUSE("Mouse is working incorrectly or not working at all.", 0),
    FIX_NO_SCREEN("Screen doesn't work.", 1),
    FIX_NO_BOOT("Computer doesn't boot up.", 1),
    FIX_BAD_BATTERY("Battery life is too short.", 1),
    FIX_OVERHEAT("Computer is heating more than usual", 2),
    FIX_STRANGE_SOUND("Computer produces strange sounds", 2),
    DIAGNOSE("Diagnose device", 3);

    private String description;
    private int priority;
    private TypeOfTask(String description, int priority) {
        this.description = description;
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public int getPriority() {
        return priority;
    }
}
