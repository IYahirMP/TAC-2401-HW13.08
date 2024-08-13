/**
 * The class Tool represents a physical tool used by a technician
 * to perform a computer repair service. This class provides
 * methods to manage a tool's data, such as its id, name, type
 * and usage.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Tool {

    /** id for the tool. */
    private int toolId;

    /** Name of the tool. */
    private String name;

    /** Type of tool (screwdriver, hammer, wrench). */
    private String type;

    /** Description of the tool's use. */
    private String usage;

    /**
     * Default constructor for Tool.
     * Defaults toolId to -1, and name, type and usage to empty strings.
     */
    public Tool() {
        toolId = -1; // Or any other default value you prefer
        name = "";
        type = "";
        usage = "";
    }

    /**
     * Constructor to create a Tool with specified values.
     *
     * @param toolId The tool ID.
     * @param name    The name of the tool.
     * @param type    The type of tool.
     * @param usage   The description of the tool's usage.
     */
    public Tool(int toolId, String name, String type, String usage) {
        this.toolId = toolId;
        this.name = name;
        this.type = type;
        this.usage = usage;
    }

    /**
     * Retrieves the id of the tool.
     * @return The id of the tool.
     */
    public int getToolId() {
        return toolId;
    }

    /**
     * Sets the id of the tool.
     * @param toolId The new id for the tool.
     */
    public void setToolId(int toolId) {
        this.toolId = toolId;
    }

    /**
     * Retrieves the name of the tool.
     * @return The name of the tool.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the tool.
     * @param name The new name of the tool.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Retrieves the type of the tool.
     * @return The type of the tool.
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the type of the tool.
     * @param type The new type of the tool.
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Retrieves the usage description of the tool.
     * @return The usage description of the tool.
     */
    public String getUsage() {
        return usage;
    }

    /**
     * Sets the usage description of the tool.
     * @param usage The new usage description of the tool.
     */
    public void setUsage(String usage) {
        this.usage = usage;
    }
}
