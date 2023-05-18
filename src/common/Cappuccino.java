package common;

import java.util.ArrayList;
import java.util.List;

public class Cappuccino extends MyBeverage {
    public Cappuccino() {
        super(createCappuccinoIngredients());
    }

    private static List<Ingredient> createCappuccinoIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("coffee", "gm", 20));
        ingredients.add(new Ingredient("milk", "ml", 50));
        ingredients.add(new Ingredient("foam", "ml", 50));
        return ingredients;
    }
}