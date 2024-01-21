package Controller;



import Model.Fruit;
import Model.Fruit;
import Model.Fruit;
import Model.Order;
import java.util.ArrayList;
import java.util.Scanner;

public class FruitShop {
    private ArrayList<Fruit> availableFruits;
    private ArrayList<Order> orders;
    private Scanner scanner;

    public FruitShop() {
        this.availableFruits = new ArrayList<>();
        this.orders = new ArrayList<>();
        this.scanner = new Scanner(System.in);
    }

    public void createFruit() {
        System.out.println("Creating a new fruit:");

        System.out.print("Enter Fruit Id: ");
        int fruitId = scanner.nextInt();
        System.out.print("Enter Fruit Name: ");
        String fruitName = scanner.next();
        System.out.print("Enter Origin: ");
        String origin = scanner.next();
        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        Fruit newFruit = new Fruit(fruitId, fruitName, origin, price);
        availableFruits.add(newFruit);

        System.out.println("Fruit added successfully.");

        System.out.print("Do you want to continue (Y/N)? ");
        String continueCreating = scanner.next();
        if (!continueCreating.equalsIgnoreCase("Y")) {
            System.out.println("Returning to the main screen.");
        }
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void startShopping() {
        if (availableFruits.isEmpty()) {
            System.out.println("No fruits available for shopping. Returning to the main screen.");
            return;
        }

        System.out.println("List of Fruits:");
        for (int i = 0; i < availableFruits.size(); i++) {
            System.out.printf("%d. %-15s %-15s %-10s\n", i + 1, availableFruits.get(i).getFruitName(),
                    availableFruits.get(i).getOrigin(), availableFruits.get(i).getPrice() + "$");
        }

        System.out.print("Please select an item: ");
        int selectedItem = scanner.nextInt();

        if (selectedItem < 1 || selectedItem > availableFruits.size()) {
            System.out.println("Invalid selection. Returning to the main screen.");
            return;
        }

        Fruit selectedFruit = availableFruits.get(selectedItem - 1);
        System.out.println("You selected: " + selectedFruit.getFruitName());
        System.out.print("Please input quantity: ");
        int quantity = scanner.nextInt();

        double amount = selectedFruit.getPrice() * quantity;

        System.out.printf("Product | Quantity | Price | Amount\n");
        System.out.printf("%-8s %-10s %-7s %-6s\n", selectedFruit.getFruitName(), quantity, selectedFruit.getPrice() + "$", amount + "$");

        System.out.print("Do you want to order now (Y/N)? ");
        String orderDecision = scanner.next();
        if (orderDecision.equalsIgnoreCase("Y")) {
            System.out.print("Input your name: ");
            String customerName = scanner.next();

            Order order = new Order(customerName);
            order.addFruit(selectedFruit, quantity);
            orders.add(order);

            System.out.println("Order placed successfully!");
        } else {
            System.out.println("Order canceled. Returning to the main screen.");
        }
    }

    public void closeScanner() {
        scanner.close();
    }

    public int getUserChoice() {
        System.out.print("Please choose an option (1-4): ");
        return scanner.nextInt();
    }
}
