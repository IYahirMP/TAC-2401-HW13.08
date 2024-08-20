package com.solvd.laba.computer_repair_service.people;

public class Person {
    /** Holds the person's first name. */
    protected String firstName;

    /** Holds the person's last name. */
    protected String lastName;

    /** Holds the person's address. */
    protected String address;

    /** Holds the person's email address. */
    protected String email;

    /** Holds the person's phone number. */
    protected String phoneNumber;

    /**
     * Default constructor for Customer.
     * Initializes customerId to 0, firstName, lastName, address, email,
     * and phoneNumber to empty strings.
     */
    Person() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.email = "";
        this.phoneNumber = "";
    }

    /**
     * Constructs a Person with specified values for all attributes.
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     * @param address The address of the customer.
     * @param email The email address of the customer.
     * @param phoneNumber The phone number of the customer.
     */
    Person(String firstName, String lastName,
             String address, String email, String phoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    /**
     * Constructs a Person with specified values for first name, and last name.
     * Address, email, and phone number are initialized to empty strings.
     * @param firstName The first name of the customer.
     * @param lastName The last name of the customer.
     */
    Person( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "";
        this.email = "";
        this.phoneNumber = "";
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

    @Override
    public String toString() {
        return  "First Name: " + firstName + "\n" +
                "Last Name: " + lastName + "\n" +
                "Address: " + address + "\n" +
                "Email: " + email + "\n" +
                "Phone Number: " + phoneNumber + "\n";
    }

}
