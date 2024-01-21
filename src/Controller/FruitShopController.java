package Controller;

import View.FruitShopView;

public class FruitShopController {
    private FruitShop model;
    private FruitShopView view;

    public FruitShopController(FruitShop model, FruitShopView view) {
        this.model = model;
        this.view = view;
    }

    public void processUserInput(int choice) {
        switch (choice) {
            case 1:
                model.createFruit();
                break;
            case 2:
                view.displayOrders(model.getOrders());
                break;
            case 3:
                model.startShopping();
                break;
            case 4:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
        }
    }
}
