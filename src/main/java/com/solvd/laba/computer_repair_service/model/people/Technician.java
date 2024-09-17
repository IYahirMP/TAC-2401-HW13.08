package com.solvd.laba.computer_repair_service.model.people;

import com.solvd.laba.computer_repair_service.model.computer.Computer;
import com.solvd.laba.computer_repair_service.model.computer.specialties.FormFactorSpecialty;
import com.solvd.laba.computer_repair_service.model.computer.specialties.OperatingSystemSpecialty;
import com.solvd.laba.computer_repair_service.model.service_management.Fault;
import com.solvd.laba.computer_repair_service.model.service_management.Task;
import com.solvd.laba.computer_repair_service.model.service_management.TypeOfTask;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * The class Technician represents a technician at the computer repair service.
 * It holds data about the technician such as his id, first name and last name,
 * experience level and specialty.
 * The class provides methods to manage the technician's data.
 *
 * @version 1.0 12 Aug 2024
 * @author Ivan Mojica
 */
public class Technician extends Employee {

    /** Holds the technician's id at the computer repair service.*/
    private int technicianId;

    private OperatingSystemSpecialty operatingSystemSpecialty;

    private FormFactorSpecialty formFactorSpecialty;

    private PriorityQueue<Task> taskQueue;

    /**
     * Default constructor for Technician.
     * Defaults technicianId to -1, firstName, lastName and specialty
     * to an empty string, and experienceLevel to 0.
     * */
    public Technician() {
        super();
        this.technicianId = -1;
        this.operatingSystemSpecialty = null;
        this.formFactorSpecialty = null;
        this.taskQueue = new PriorityQueue<>();
    }

    /**
     * Creates a technician with name, address, email, phone number, employee id and technician id.
     * @param technicianId The new Technician's id
     */
    public Technician (String firstName, String lastName,
                       String address, String email, String phoneNumber,
                       int employeeId ,int technicianId) {
        super(firstName, lastName, address, email, phoneNumber, employeeId, Position.Technician);
        this.technicianId = technicianId;
    }

    /**
     * Creates a technician with name, address, email, phone number, employee id and technician id.
     * @param technicianId The new Technician's id
     */
    public Technician (String firstName, String lastName,
                       String address, String email, String phoneNumber,
                       int employeeId ,int technicianId,
                       OperatingSystemSpecialty osSpecialty,
                       FormFactorSpecialty formFactorSpecialty) {
        super(firstName, lastName, address, email, phoneNumber, employeeId, Position.Technician);
        this.technicianId = technicianId;
        this.operatingSystemSpecialty = osSpecialty;
        this.formFactorSpecialty = formFactorSpecialty;
        this.taskQueue = new PriorityQueue<>();
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

    public void addTask(Task task){
        taskQueue.add(task);
    }

    public Task getNextTask(){
        return taskQueue.peek();
    }

    public void performNextTask(){
        if (taskQueue.isEmpty()){
            return;
        }

        Task currentTask = taskQueue.peek();
        Computer computer = currentTask.getComputer();

        switch(currentTask.getTypeOfTask()){
            case TypeOfTask.DIAGNOSE -> diagnose(computer);
            case TypeOfTask.FIX_BAD_BATTERY -> fixBattery(computer);
            case TypeOfTask.FIX_BAD_MOUSE -> fixMouse(computer);
            case TypeOfTask.FIX_NO_BOOT -> fixBoot(computer);
            case TypeOfTask.FIX_OVERHEAT -> fixOverHeat(computer);
            case TypeOfTask.FIX_NO_SCREEN -> fixBadScreen(computer);
            case TypeOfTask.FIX_BAD_KEYBOARD -> fixKeyboard(computer);
            case TypeOfTask.FIX_STRANGE_SOUND -> fixStrangeSound(computer);
            case TypeOfTask.MAINTENANCE -> maintain(computer);
            case TypeOfTask.REPAIR -> repair(computer);
        }

        taskQueue.poll();
    }

    public void diagnose(Computer computer){
        ArrayList<Fault> faults = new ArrayList<>();

        formFactorSpecialty.diagnose(computer);

        System.out.println("Computer has been diagnosed");
    }

    public void fixBattery(Computer computer){
        System.out.println("Computer battery fixed");
    }

    public void fixMouse(Computer computer){
        System.out.println("Computer mouse fixed");
    }

    public void fixBoot(Computer computer){
        System.out.println("Computer boot fixed");
    }

    public void fixOverHeat(Computer computer){
        System.out.println("Computer overheat fixed");
    }

    public void fixBadScreen(Computer computer){
        System.out.println("Computer bad screen fixed");
    }

    public void fixKeyboard(Computer computer){
        System.out.println("Computer keyboard fixed");
    }

    public void fixStrangeSound(Computer computer){
        System.out.println("Computer strange sound fixed");
    }

    public void maintain(Computer computer){
        System.out.println("Computer maintenance done");
    }

    public void repair(Computer computer){
        System.out.println("Computer repaired");
    }

    public OperatingSystemSpecialty getOperatingSystemSpecialty() {
        return operatingSystemSpecialty;
    }

    public void setOperatingSystemSpecialty(OperatingSystemSpecialty operatingSystemSpecialty) {
        this.operatingSystemSpecialty = operatingSystemSpecialty;
    }

    public FormFactorSpecialty getFormFactorSpecialty() {
        return formFactorSpecialty;
    }

    public void setFormFactorSpecialty(FormFactorSpecialty formFactorSpecialty) {
        this.formFactorSpecialty = formFactorSpecialty;
    }

    public PriorityQueue<Task> getTaskQueue() {
        return taskQueue;
    }

    public void setTaskQueue(PriorityQueue<Task> taskQueue) {
        this.taskQueue = taskQueue;
    }

    @Override
    public String toString() {
        String result = super.toString();
        result += "Technician ID: " + technicianId;
        result += "\n";
        return result;
    }

    @Override
    public int hashCode(){
        int hash = 17;
        hash = 31 * hash + super.hashCode();
        hash = 31 * hash + technicianId;
        hash = 31 * hash + operatingSystemSpecialty.hashCode();
        hash = 31 * hash + formFactorSpecialty.hashCode();
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

        Technician other = (Technician) obj;
        return super.equals(obj)
                && technicianId == other.technicianId;
    }
}