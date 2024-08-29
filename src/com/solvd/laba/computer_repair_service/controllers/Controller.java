package com.solvd.laba.computer_repair_service.controllers;

public interface Controller<T> {
    public T create(); // Shows a creation view, then stores and returns the new object
    public void show(int id); // Displays information for provided id's object
    public void update(int id); // Displays an update form for given id
    public void delete(int id); // Deletes given id and informs results to the user though a view
    public T find(int id); // Returns an object reference for given id
}
