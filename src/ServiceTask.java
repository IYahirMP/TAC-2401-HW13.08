/**
 * The ServiceTask class represents an individual task that is performed within
 * the scope of a service request. Many services may be performed within the same
 * service requests.
 * This class provides methods to manage task data such as the taskId, description,
 * status, priority and cost.
 */
public class ServiceTask {

    /** Holds the available values for status*/
    public enum Status {ONGOING, ON_HOLD, PENDING}

    /** Holds the id for the task.*/
    private int taskId;

    /** Holds a description of the task.*/
    private String description;

    /** Holds the status of the task, whether it has been completed, is pending or in hold*/
    private Status status;

    /** Holds the priority of the task. Higher values mean higher priority*/
    private int priority;

    /** Holds the cost of the task.*/
    private double cost;

    /**
     * Default constructor for ServiceTask.
     * Defaults taskId to -1, description and status to empty strings,
     * priority to 0, and cost to 0.0.
     * */
    public ServiceTask() {
        this.taskId = -1;
        this.description = "";
        this.status = Status.PENDING;
        this.priority = 0;
        this.cost = 0;
    }

    /**
     * Creates a ServiceTask with the given taskId, description, status, priority and cost.
     * @param taskId The id for the task.
     * @param description The description of the task.
     * @param status The status of the task.
     * @param priority The priority of the task.
     * @param cost The cost of the task.
     */
    public ServiceTask(int taskId, String description, Status status, int priority, double cost) {
        this.taskId = taskId;
        this.description = description;
        this.status = status;
        this.priority = priority;
        this.cost = cost;
    }

    /**
     * Creates a task with an id, description and cost.
     * It defaults priority and status to 0 and PENDING, respectively.
     * @param taskId
     * @param description
     * @param cost
     */
    public ServiceTask(int taskId, String description, double cost) {
        this.taskId = taskId;
        this.description = description;
        this.status = Status.PENDING;
        this.priority = 0;
        this.cost = cost;
    }

    /**
     * Retrieves the id for the task.
     * @return The task id.
     */
    public int getTaskId() {
        return this.taskId;
    }

    /**
     * Sets the taskId to the given id.
     * @param taskId The new id for the task.
     */
    public void setTaskId(int taskId) {
        this.taskId = taskId;
    }

    /**
     * Retrieves the description of the task.
     * @return A brief description of the task.
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * Sets the description of the task to the given one.
     * @param description The new description of the task.
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Retrieves the status of the task.
     * @return The status of the task.
     */
    public String getStatus() {
        return this.status.toString();
    }

    /**
     * Sets the status of the task to a new one.
     * @param status The new status of the task.
     */
    public void setStatus(Status status) {
        this.status = status;
    }

    /**
     * Retrieves the priority of the task.
     * @return The priority of the task.
     */
    public int getPriority() {
        return this.priority;
    }

    /**
     * Sets the priority of the task to a new one.
     * @param priority The new priority of the task.
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * Retrieves the cost assigned to the task.
     * @return The cost of the task.
     */
    public double getCost() {
        return this.cost;
    }

    /**
     * Sets a new cost for the task.
     * @param cost The new cost for the task.
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

}