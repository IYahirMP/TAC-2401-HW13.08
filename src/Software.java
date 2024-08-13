import java.time.LocalDate;

/**
 * The Software class represents a software installed on a computer during
 * the repair service. It holds information such as the software id, name,
 * version, license key, vendor, purchase date and expiration date, cost,
 * type of product and status.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Software {

    /** Holds the id for the installed software. */
    private int softwareId;

    /** Holds the software name. */
    private String name;

    /** Holds the software version. */
    private String version;

    /** Holds the software license key. */
    private String licenseKey;

    /** Holds the software vendor name. */
    private String vendor;

    /** Holds the software purchase date. */
    private LocalDate purchaseDate;

    /** Holds the software expiration date. */
    private LocalDate expirationDate;

    /** Holds the software license cost. */
    private double cost;

    /** Holds the type of software. */
    private String productType;

    /** Holds the status of the software (expired or not). */
    private String status;

    /**
     * Default constructor for Software.
     * Initializes softwareId to -1, then name, version, licenseKey, vendor,
     * productType and status to an empty string, then purchaseDate and
     * expirationDate to current date, then cost to 0.0.
     */
    public Software() {
        softwareId = -1;
        name = "";
        version = "";
        licenseKey = "";
        vendor = "";
        purchaseDate = LocalDate.now();
        expirationDate = LocalDate.now();
        cost = 0.0;
        productType = "";
        status = "";
    }

    /**
     * Creates a Software with the specified values.
     *
     * @param softwareId   The software ID.
     * @param name        The name of the software.
     * @param version     The software version.
     * @param licenseKey  The software license key.
     * @param vendor      The software vendor.
     * @param purchaseDate The software purchase date.
     * @param expirationDate The software expiration date.
     * @param cost        The software cost.
     * @param productType The software type.
     * @param status      The software status.
     */
    public Software(int softwareId, String name, String version, String licenseKey,
                    String vendor, LocalDate purchaseDate, LocalDate expirationDate,
                    double cost, String productType, String status) {
        this.softwareId = softwareId;
        this.name = name;
        this.version = version;
        this.licenseKey = licenseKey;
        this.vendor = vendor;
        this.purchaseDate = purchaseDate;
        this.expirationDate = expirationDate;
        this.cost = cost;
        this.productType = productType;
        this.status = status;
    }

    /**
     * Retrieves the software id.
     * @return The software id.
     */
    public int getSoftwareId() {
        return softwareId;
    }

    /**
     * Sets the software id to a given one.
     * @param softwareId The new software id.
     */
    public void setSoftwareId(int softwareId) {
        this.softwareId = softwareId;
    }

    /**
     * Retrieves the software name.
     * @return The software name.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the software name to a given one.
     * @param name The new software name.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the software version.
     * @return The software version.
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the software version to a new one.
     * @param version The new software version.
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * Retrieves the software license key.
     * @return The software license key.
     */
    public String getLicenseKey() {
        return licenseKey;
    }

    /**
     * Sets the software license key.
     * @param licenseKey The new software license key.
     */
    public void setLicenseKey(String licenseKey) {
        this.licenseKey = licenseKey;
    }

    /**
     * Retrieves the software vendor.
     * @return The software vendor.
     */
    public String getVendor() {
        return vendor;
    }

    /**
     * Sets the software vendor name to a given one.
     * @param vendor The new software vendor.
     */
    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    /**
     * Retrieves the software purchase date.
     * @return The software purchase date.
     */
    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    /**
     * Sets the software purchase date to a given one.
     * @param purchaseDate The new software purchase date.
     */
    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    /**
     * Retrieves the software expiration date.
     * @return The software expiration date.
     */
    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the software expiration date to a given one.
     * @param expirationDate The new software expiration date.
     */
    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * Retrieves the software cost.
     * @return The software cost.
     */
    public double getCost() {
        return cost;
    }

    /**
     * Sets the software cost to a given one.
     * @param cost The new software cost.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * Retrieves the software product type.
     * @return The software product type.
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * Sets the software product type to a given one.
     * @param productType The new software type.
     */
    public void setProductType(String productType) {
        this.productType= productType;
    }

    /**
     * Retrieves the software status.
     * @return The software status.
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the software status to a given one.
     * @param status The new software status.
     */
    public void setStatus(String status) {
        this.status = status;
    }
}

