package models;

import java.math.BigDecimal;

public class Item {

    private String name;
    private String category;
    private BigDecimal cost;
    private BigDecimal price;
    private double ounces;
    private int quantity;

    public Item(String name, String category, BigDecimal cost, BigDecimal price, double ounces, int quantity){
        this.name = name;
        this.category = category;
        this.cost = cost;
        this.price = price;
        this.ounces = ounces;
        this.quantity = quantity;
    }

    public String getName(){
        return this.name;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public double getOunces() {
        return ounces;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setOunces(double ounces) {
        this.ounces = ounces;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}


