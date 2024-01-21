/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Order {
    private String customerName;
    private ArrayList<Fruit> fruits;

    public Order(String customerName) {
        this.customerName = customerName;
        this.fruits = new ArrayList<>();
    }

    public void addFruit(Fruit fruit, int quantity) {
        fruit.setQuantity(quantity);
        fruits.add(fruit);
    }

    public double calculateTotal() {
        double total = 0;
        for (Fruit fruit : fruits) {
            total += fruit.calculateAmount();
        }
        return total;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("Customer: " + customerName + "\n");
        for (Fruit fruit : fruits) {
            result.append(fruit.toString()).append("\n");
        }
        result.append("Total: ").append(calculateTotal()).append("$\n");
        return result.toString();
    }
}
