package com.solvd.laba.computer_repair_service.model.people;

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
     * Default constructor for Person.
     * Initializes personId to 0, firstName, lastName, address, email,
     * and phoneNumber to empty strings.
     */
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.address = "";
        this.email = "";
        this.phoneNumber = "";
    }

    /**
     * Constructs a Person with specified values for all attributes.
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     * @param address The address of the person.
     * @param email The email address of the person.
     * @param phoneNumber The phone number of the person.
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
     * @param firstName The first name of the person.
     * @param lastName The last name of the person.
     */
    Person( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = "";
        this.email = "";
        this.phoneNumber = "";
    }

    /**
     * Retrieves the first name of the person.
     * @return The firstName of the person.
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Retrieves the last name of the person.
     * @return The lastName of the person.
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Retrieves the address of the person.
     * @return The address of the person.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Retrieves the email address of the person.
     * @return The email address of the person.
     */
    public String getEmail() {
        return email;
    }

    /**
     * Retrieves the phone number of the person.
     * @return The phoneNumber of the person.
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Sets the first name of the person.
     * @param firstName The first name to set for the person.
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Sets the last name of the person.
     * @param lastName The last name to set for the person.
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Sets the address of the person.
     * @param address The address to set for the person.
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * Sets the email address of the person.
     * @param email The email address to set for the person.
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Sets the phone number of the person.
     * @param phoneNumber The phone number to set for the person.
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

    @Override
    public int hashCode(){
        int hash = 17;
        hash = hash * 31 + firstName.hashCode();
        hash = hash * 31 + lastName.hashCode();
        hash = hash * 31 + address.hashCode();
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

        Customer other = (Customer) obj;
        return firstName.equals(other.firstName)
                && lastName.equals(other.lastName)
                && address.equals(other.address);
    }

}
