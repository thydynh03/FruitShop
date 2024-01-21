package View;

import Model.Order;
import Model.Fruit;

import java.util.ArrayList;

public class FruitShopView {
    public void displayMainScreen() {
        System.out.println("FRUIT SHOP SYSTEM");
        System.out.println("1. Create Fruit");
        System.out.println("2. View Orders");
        System.out.println("3. Shopping (for buyer)");
        System.out.println("4. Exit");
        System.out.print("Please choose an option (1-4): ");
    }

    public void displayOrders(ArrayList<Order> orders) {
        if (orders.isEmpty()) {
            System.out.println("No orders available to display.");
            return;
        }

        for (Order order : orders) {
            System.out.println(order.toString());
        }
    }

    public void displayAvailableFruits(ArrayList<Fruit> availableFruits) {
        System.out.println("List of Fruits:");
        System.out.printf("%-10s %-15s %-15s %-10s\n", "++ Item ++", "++ Fruit Name ++", "++ Origin ++", "++ Price ++");

        int itemNumber = 1;
        for (Fruit fruit : availableFruits) {
            System.out.printf("%-10s %-15s %-15s %-10s\n", itemNumber++, fruit.getFruitName(),
                    fruit.getOrigin(), fruit.getPrice() + "$");
        }
    }

    public void displayOrderSummary(Order order) {
        System.out.println("Order placed successfully!");
        System.out.println(order.toString());
    }
}
