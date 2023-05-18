package common;

import java.util.ArrayList;
import java.util.List;

public class Espresso extends MyBeverage {
    public Espresso() {
        super(createEspressoIngredients());
    }

    private static List<Ingredient> createEspressoIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("coffee", "gm", 20));
        ingredients.add(new Ingredient("water", "ml", 30));
        return ingredients;
    }
}
