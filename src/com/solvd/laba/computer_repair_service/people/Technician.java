package com.solvd.laba.computer_repair_service.people;

import com.solvd.laba.computer_repair_service.computer.specialties.FormFactorSpecialty;
import com.solvd.laba.computer_repair_service.computer.specialties.OperatingSystemSpecialty;

/**
 * The class Technician represents a technician at the computer repair service.
 * It holds data about the technician such as his id, first name and last name,
 * experience level and specialty.
 * The class provides methods to manage the technician's data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Technician extends Employee{

    /** Holds the technician's id at the computer repair service.*/
    private int technicianId;

    private OperatingSystemSpecialty operatingSystemSpecialty;

    private FormFactorSpecialty formFactorSpecialty;

    /**
     * Default constructor for Technician.
     * Defaults technicianId to -1, firstName, lastName and specialty
     * to an empty string, and experienceLevel to 0.
     * */
    public Technician() {
        super();
        this.technicianId = -1;
    }

    /**
     * Creates a technician with name, address, email, phone number, employee id and technician id.
     * @param technicianId The new Technician's id
     */
    public Technician (String firstName, String lastName,
                       String address, String email, String phoneNumber, int employeeId ,int technicianId) {
        super(firstName, lastName, address, email, phoneNumber, employeeId, Position.Technician);
        this.technicianId = technicianId;
    }

    /**
     * Creates a technician with name, address, email, phone number, employee id and technician id.
     * @param technicianId The new Technician's id
     */
    public Technician (String firstName, String lastName,
                       String address, String email, String phoneNumber,
                       int employeeId ,int technicianId,
                       OperatingSystemSpecialty osSpecialty,
                       FormFactorSpecialty formFactorSpecialty) {
        super(firstName, lastName, address, email, phoneNumber, employeeId, Position.Technician);
        this.technicianId = technicianId;
        this.operatingSystemSpecialty = osSpecialty;
        this.formFactorSpecialty = formFactorSpecialty;
    }

    /**
     * Retrieves the technician's id.
     * @return The technician's id.
     */
    public int getTechnicianId() {
        return this.technicianId;
    }

    /**
     * Sets the technicianId to a given value.
     * @param technicianId The new technician id
     */
    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Technician ID: " + technicianId;
        return result;
    }
}