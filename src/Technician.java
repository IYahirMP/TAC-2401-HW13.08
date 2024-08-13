/**
 * The class Technician represents a technician at the computer repair service.
 * It holds data about the technician such as his id, first name and last name,
 * experience level and specialty.
 * The class provides methods to manage the technician's data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Technician {

    /** Holds the technician's id at the computer repair service.*/
    private int technicianId;

    /** Holds the first name of the technician*/
    private String firstName;

    /** Holds the last name of the technician*/
    private String lastName;

    /** Holds the technician's experience level. Values up to 3 indicate more experience*/
    private int experienceLevel;

    /** Holds the technician's specialty.*/
    private String specialty;

    /**
     * Default constructor for Technician.
     * Defaults technicianId to -1, firstName, lastName and specialty
     * to an empty string, and experienceLevel to 0.
     * */
    public Technician() {
        this.technicianId = -1;
        this.firstName = "";
        this.lastName = "";
        this.experienceLevel = 0;
        this.specialty = "";
    }

    /**
     * Creates a Technician with the given id, first and last names, experience
     * level and specialty.
     * @param technicianId
     * @param firstName
     * @param lastName
     * @param experienceLevel
     * @param specialty
     */
    public Technician(int technicianId, String firstName, String lastName, int experienceLevel, String specialty) {
        this.technicianId = technicianId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceLevel = experienceLevel;
        this.specialty = specialty;
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
     * @param technicianId
     */
    public void setTechnicianId(int technicianId) {
        this.technicianId = technicianId;
    }

    /**
     * Retrieves the technician's first name.
     * @return The first name of the technician.
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Sets the technician's first name given a new name.
     * @param firstName The technician's new first name.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Retrievees the technician's last name.
     * @return The last name of the technician.
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Sets the technician's last name given a new name.
     * @param lastName The new last name for the technician.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Retrieves the technician's experience level.
     * @return The technician's experience level.
     */
    public int getExperienceLevel() {
        return this.experienceLevel;
    }

    /**
     * Sets the technician's experience level.
     * @param value The new experience level.
     */
    public void setExperienceLevel(int value) {
        this.experienceLevel = value;
    }

    /**
     * Retrieves the technician's specialty.
     * @return The technician's specialty.
     */
    public String getSpecialty() {
        return this.specialty;
    }

    /**
     * Sets the technician's specialty.
     * @param value The new specialty.
     */
    public void setSpecialty(String value) {
        this.specialty = value;
    }

    public void printInfo(){
        System.out.println("Technician ID: " + this.technicianId);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Experience Level: " + this.experienceLevel);
        System.out.println("Specialty: " + this.specialty);
        System.out.println("------------------------------------");
    }
}