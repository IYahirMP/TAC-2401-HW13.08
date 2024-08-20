package com.solvd.laba.computer_repair_service.people;

/**
 * The class Technician represents a technician at the computer repair service.
 * It holds data about the technician such as his id, first name and last name,
 * experience level and specialty.
 * The class provides methods to manage the technician's data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Technician extends Person{

    /** Holds the technician's id at the computer repair service.*/
    private int technicianId;

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
     * Creates a Technician with the given id, first and last names, experience
     * level and specialty.
     * @param technicianId The new Technician's id
     */
    public Technician(int technicianId, String firstName, String lastName) {
        super(firstName,lastName);
        this.technicianId = technicianId;
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