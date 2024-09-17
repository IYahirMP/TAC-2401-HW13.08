package com.solvd.laba.computer_repair_service.model.service_management;

import com.solvd.laba.computer_repair_service.model.people.Technician;

import java.util.ArrayList;

public class Report {
    private Task task;
    private ServiceRequest serviceRequest;
    private Technician technician;
    private int id;

    private int totalFaults = 0;
    private int softwareFaults = 0;
    private int hardwareFaults = 0;

    private ArrayList<Fault> faults = new ArrayList<Fault>();

    public Report(Task task, ArrayList<Fault> faults){
        this.task = task;
        this.faults = faults;
        this.serviceRequest = task.getRequest();
    }

    public Report(Task task){
        this.task = task;
        this.serviceRequest = task.getRequest();
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    public ServiceRequest getServiceRequest() {
        return serviceRequest;
    }

    public void setServiceRequest(ServiceRequest serviceRequest) {
        this.serviceRequest = serviceRequest;
    }

    public Technician getTechnician() {
        return technician;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTotalFaults() {
        return totalFaults;
    }

    public void setTotalFaults(int totalFaults) {
        this.totalFaults = totalFaults;
    }

    public int getSoftwareFaults() {
        return softwareFaults;
    }

    public void setSoftwareFaults(int softwareFaults) {
        this.softwareFaults = softwareFaults;
    }

    public int getHardwareFaults() {
        return hardwareFaults;
    }

    public void setHardwareFaults(int hardwareFaults) {
        this.hardwareFaults = hardwareFaults;
    }

    public ArrayList<Fault> getFaults() {
        return faults;
    }

    public void setFaults(ArrayList<Fault> faults) {
        this.faults = faults;
    }
}
