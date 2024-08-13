import java.time.LocalDate;

/**
 * The class Customer represents a customer of the computer repair service.
 * It holds information such as the customer's id, first and last name, address,
 * email, and phone number. This class provides methods to create and manage customer data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Customer {

    /** Holds the customer id. */
    private int customerId;

    /** Holds the customer's first name. */
    private String firstName;

    /** Holds the customer's last name. */
    private String lastName;

    /** Holds the customer's address. */
    private String address;

    /** Holds the customer's email address. */
    private String email;

    /** Holds the customer's phone number. */
    private String phoneNumber;

    /**
     * Default constructor for Customer.
     * Initializes customerId to 0, firstName, lastName, address, email,
     * and phoneNumber to empty strings.
     */
    Customer() {
        this.customerId = 0;
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.email = "";
        this.phoneNumber = "";
    }

    /**
     * Constructs a Customer with specified values for all attributes.
     * @param customerId The unique identifier for the customer.
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     * @param address The address of the customer.
     * @param email The email address of the customer.
     * @param phoneNumber The phone number of the customer.
     */
    Customer(int customerId, String firstName, String lastName,
             String address, String email, String phoneNumber) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Constructs a Customer with specified values for id, first name, and last name.
     * Address, email, and phone number are initialized to empty strings.
     * @param customerId The unique identifier for the customer.
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     */
    Customer(int customerId, String firstName, String lastName) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "";
        this.email = "";
        this.phoneNumber = "";
    }

    /**
     * Retrieves the unique identifier of the customer.
     * @return The customerId of the Customer.
     */
    public int getCustomerId() {
        return customerId;
    }

    /**
     * Retrieves the first name of the customer.
     * @return The firstName of the Customer.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retrieves the last name of the customer.
     * @return The lastName of the Customer.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the address of the customer.
     * @return The address of the Customer.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Retrieves the email address of the customer.
     * @return The email address of the Customer.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Retrieves the phone number of the customer.
     * @return The phoneNumber of the Customer.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the unique identifier for the customer.
     * @param customerId The unique identifier to set for the Customer.
     */
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    /**
     * Sets the first name of the customer.
     * @param firstName The first name to set for the Customer.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the customer.
     * @param lastName The last name to set for the Customer.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the address of the customer.
     * @param address The address to set for the Customer.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the email address of the customer.
     * @param email The email address to set for the Customer.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the phone number of the customer.
     * @param phoneNumber The phone number to set for the Customer.
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
