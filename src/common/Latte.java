package common;

import java.util.ArrayList;
import java.util.List;

public class Latte extends MyBeverage {
    public Latte() {
        super(createLatteIngredients());
    }

    private static List<Ingredient> createLatteIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("coffee", "gm", 20));
        ingredients.add(new Ingredient("milk", "ml", 100));
        return ingredients;
    }
}
