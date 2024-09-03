package com.solvd.laba.computer_repair_service.model.accounting;

public class OrderItem {
    private String description;
    private double price;
    private int quantity;

    public OrderItem(String description, double price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Description: " + description + "\n");
        sb.append("Price: " + price + "\n");
        sb.append("Quantity: " + quantity + "\n");

        return sb.toString();
    }
}
