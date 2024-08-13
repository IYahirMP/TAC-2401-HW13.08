import java.time.LocalDate;

/**
 * Represents an invoice with details about the invoice ID, issue date,
 * total amount, and client name. The class provides methods to
 * manage the invoice's data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Invoice {

    /**
     * Unique identifier for the invoice.
     */
    private int invoiceId;

    /**
     * Date when the invoice was issued.
     */
    private LocalDate issueDate;

    /**
     * Total amount of the invoice.
     */
    private double totalAmount;

    /**
     * Name of the client associated with the invoice.
     */
    private String clientName;

    /**
     * Default constructor for Invoice.
     * Defaults invoiceId to -1, issueDate to today's date,
     * totalAmount to 0.0 and clientName to an empty string.
     */
    public Invoice() {
        invoiceId = -1;
        issueDate = LocalDate.now();
        totalAmount = 0.0;
        clientName = "";
    }

    /**
     * Constructor to create an Invoice with the specified values.
     *
     * @param invoiceId   The invoice ID.
     * @param issueDate   The issue date.
     * @param totalAmount The total amount of the invoice.
     * @param clientName  The client's name.
     */
    public Invoice(int invoiceId, LocalDate issueDate, double totalAmount, String clientName) {
        this.invoiceId = invoiceId;
        this.issueDate = issueDate;
        this.totalAmount = totalAmount;
        this.clientName = clientName;
    }

    /**
     * Retrieves the invoice ID.
     *
     * @return The invoice ID.
     */
    public int getInvoiceId() {
        return invoiceId;
    }

    /**
     * Sets the invoice ID.
     *
     * @param invoiceId The new invoice ID.
     */
    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    /**
     * Retrieves the issue date of the invoice.
     *
     * @return The issue date.
     */
    public LocalDate getIssueDate() {
        return issueDate;
    }

    /**
     * Sets the issue date of the invoice.
     *
     * @param issueDate The new issue date.
     */
    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    /**
     * Retrieves the total amount of the invoice.
     *
     * @return The total amount.
     */
    public double getTotalAmount() {
        return totalAmount;
    }

    /**
     * Sets the total amount of the invoice.
     *
     * @param totalAmount The new total amount.
     */
    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    /**
     * Retrieves the client's name associated with the invoice.
     *
     * @return The client's name.
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * Sets the client's name associated with the invoice.
     *
     * @param clientName The new client name.
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void printInfo(){
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Total Amount: " + totalAmount);
        System.out.println("Client Name: " + clientName);
        System.out.println("------------------------------------");
    }
}
