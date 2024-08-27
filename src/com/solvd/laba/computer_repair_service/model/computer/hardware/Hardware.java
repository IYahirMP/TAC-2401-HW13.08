package com.solvd.laba.computer_repair_service.model.computer.hardware;

public abstract class Hardware {
    protected String brand;
    protected String model;
    protected boolean isWorkingProperly;

    public Hardware(){
        this.brand = "";
        this.model = "";
        this.isWorkingProperly = false;
    }

    public Hardware(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.isWorkingProperly = true;
    }

    public Hardware(String brand, String model, boolean isWorkingProperly) {
        this.brand = brand;
        this.model = model;
        this.isWorkingProperly = isWorkingProperly;
    }

    public final String getBrand() {
        return brand;
    }

    public final void setBrand(String brand) {
        this.brand = brand;
    }

    public final String getModel() {
        return model;
    }

    public final void setModel(String model) {
        this.model = model;
    }

    public final boolean isWorkingProperly() {
        return isWorkingProperly;
    }

    public final void setWorkingProperly(boolean isWorkingProperly) {
        this.isWorkingProperly = isWorkingProperly;
    }

    @Override
    public String toString() {
        return  "Brand: " + this.brand + "\n" +
                "Model: " + this.model + "\n" +
                "IsWorkingProperly: " + this.isWorkingProperly + "\n";
    }
}
