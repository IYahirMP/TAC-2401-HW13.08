package com.solvd.laba.computer_repair_service.model.computer;

public enum FormFactor {
    DESKTOP("Desktop computer", "Stationary, for home or office use"),
    ALL_IN_ONE("All-in-One", "Integrated system with monitor and hardware combined"),
    LAPTOP("Laptop", "Portable computer for mobile use");

    private final String displayName;
    private final String description;

    // Constructor para el enum con parámetros
    FormFactor(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    // Método para obtener el nombre amigable
    public String getDisplayName() {
        return displayName;
    }

    // Método para obtener la descripción
    public String getDescription() {
        return description;
    }

    // Método sobrescrito para mostrar información específica de cada FormFactor
    @Override
    public String toString() {
        return displayName + ": " + description;
    }
}
