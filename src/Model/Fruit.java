/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ASUS
 */
public class Fruit {
    private int fruitId;
    private String fruitName;
    private String origin;
    private double price;
    private int quantity;

    public Fruit(int fruitId, String fruitName, String origin, double price) {
        this.fruitId = fruitId;
        this.fruitName = fruitName;
        this.origin = origin;
        this.price = price;
        this.quantity = 0;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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


    public double calculateAmount() {
        return quantity * price;
    }

    @Override
    public String toString() {
        return String.format("%-15s %-15s %-10s %-10s", fruitName, quantity, price + "$", calculateAmount() + "$");
    }
}
