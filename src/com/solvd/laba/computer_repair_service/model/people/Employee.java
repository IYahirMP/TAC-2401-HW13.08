package com.solvd.laba.computer_repair_service.model.people;

public class Employee extends Person{
    public enum Position {Technician}
    private int employeeId;
    private Position position;

    public Employee(){
        super();
        employeeId = -1;
        position = null;
    }

    public Employee(String firstName, String lastName,
           String address, String email, String phoneNumber, int employeeId, Position position) {
        super(firstName, lastName, address, email, phoneNumber);
        this.employeeId = employeeId;
        this.position = position;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}
