import common.*;
import controller.BeverageController;

public class Main {
    public static void main(String[] args) {
        BeverageInterface espresso = new Espresso();
        BeverageController espressoController = new BeverageController(espresso);
        espressoController.makeBeverage();

        BeverageInterface latte = new Latte();
        BeverageController latteController = new BeverageController(latte);
        latteController.makeBeverage();

        BeverageInterface cappuccino = new Cappuccino();
        BeverageController cappuccinoController = new BeverageController(cappuccino);
        cappuccinoController.makeBeverage();

        BeverageInterface tea = new Tea();
        BeverageController teaController = new BeverageController(tea);
        teaController.makeBeverage();
    }
}