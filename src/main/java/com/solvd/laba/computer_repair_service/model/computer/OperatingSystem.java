package com.solvd.laba.computer_repair_service.model.computer;

public enum OperatingSystem {
    LINUX("Linux", true),
    WINDOWS("Windows", false),
    MAC("Mac OS", false);

    private final String name;
    private final boolean isOpenSource;

    // Constructor para el enum con parámetros
    OperatingSystem(String name, boolean isOpenSource) {
        this.name = name;
        this.isOpenSource = isOpenSource;
    }

    // Método para obtener el nombre del sistema operativo
    public String getName() {
        return name;
    }

    // Método para saber si es de código abierto
    public boolean isOpenSource() {
        return isOpenSource;
    }

    @Override
    public String toString() {
        return name + " (Open Source: " + isOpenSource + ")";
    }
}
