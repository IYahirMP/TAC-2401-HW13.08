package com.solvd.laba.computer_repair_service.model.people;

public class Employee extends Person{
    public enum Position {
        Technician("Expert in computer repair and maintenance.");

        private String details;
        Position(String details) {
            this.details = details;
        }

        public String getDetails() {
            return details;
        }
    }

    protected int employeeId;
    protected Position position;

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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(super.toString());
        sb.append("\nEmployee ID: " + employeeId);
        sb.append("\nPosition: " + position.toString());
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public int hashCode(){
        int hash = 17;
        hash = 31 * hash + super.hashCode();
        hash = 31 * hash + employeeId;
        return hash;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }

        if (obj == null || getClass() != obj.getClass()){
            return false;
        }

        Employee other = (Employee) obj;
        return employeeId == other.employeeId;
    }
}
