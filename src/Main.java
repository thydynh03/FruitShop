
import Controller.FruitShopController;
import Controller.FruitShop;
import View.FruitShopView;

public class Main {
    public static void main(String[] args) {
        FruitShop model = new FruitShop();
        FruitShopView view = new FruitShopView();
        FruitShopController controller = new FruitShopController(model, view);

        try {
            while (true) {
                view.displayMainScreen();
                int choice = model.getUserChoice();
                controller.processUserInput(choice);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            model.closeScanner();
        }
    }
}
