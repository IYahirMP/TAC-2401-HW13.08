/**
 * The class ComputerPart represents a physical part of a computer and
 * stores its partId at the computer repair service, name, manufacturer,
 * and cost. It provides methods to manage the ComputerPart's data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class ComputerPart {

    /** Holds the computer part's id at the computer repair service*/
    private int partId;

    /** Holds the computer part´s name. */
    private String name;

    /** Holds the computer part´s manufacturer´s name. */
    private String manufacturer;

    /** Holds the cost of the computer part.*/
    private double cost;

    /**
     * Default constructor for ComputerPart.
     * Initializes partId to -1, name and manufacturer to an empty string,
     * and cost to 0.0.
     */
    public ComputerPart() {
        this.partId = 0;
        this.name = "";
        this.manufacturer = "";
        this.cost = 0;
    }

    /**
     * Initializes partId, name, manufacturer and cost to the given values.
     * Allows to define all members of the ComputerPart.
     * @param partId Computer repair service id for the new computer part.
     * @param name Name of the part.
     * @param manufacturer Name of the part's manufacturer.
     * @param cost Cost of the part.
     */
    public ComputerPart(int partId, String name, String manufacturer, double cost) {
        this.partId = partId;
        this.name = name;
        this.manufacturer = manufacturer;
        this.cost = cost;
    }

    /**
     * Constructor for computer parts with unknown cost.
     * Sets partId, name and manufacturer to their given values, but cost is set to 0.0.
     * @param partId Computer repair service id for the new computer part.
     * @param name Name of the part.
     * @param manufacturer Name of the part's manufacturer.
     */
    public ComputerPart(int partId, String name, String manufacturer) {
        this.partId = partId;
        this.name = name;
        this.manufacturer = manufacturer;
        this.cost = 0.0;
    }

    /**
     * Retrieves the part's id for the computer repair service.
     * @return The ComputerPart's id
     */
    public int getPartId() {
        return this.partId;
    }

    /**
     * Sets the part's id to the given value.
     * @param partId The new id for the computer part.
     */
    public void setPartId(int partId) {
        this.partId = partId;
    }

    /**
     * Retrieves the part's name.
     * @return The name of the computer part.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Sets the part's name to a given name.
     * @param name The new name for the computer part.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the manufacturer's name of the computer part.
     * @return The part manufacturer's name.
     */
    public String getManufacturer() {
        return this.manufacturer;
    }

    /**
     * Sets the name of the part's manufacturer to the given value.
     * @param manufacturer The new name for the part's manufacturer.
     */
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    /**
     * Retrieves the cost of the part.
     * @return The cost of the part.
     */
    public double getCost() {
        return this.cost;
    }

    /**
     * Sets the cost of the part to a given value.
     * @param cost The cost of the part.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

}