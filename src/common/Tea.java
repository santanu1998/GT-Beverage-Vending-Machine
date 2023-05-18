package common;

import java.util.ArrayList;
import java.util.List;

public class Tea extends MyBeverage {
    public Tea() {
        super(createTeaIngredients());
    }

    private static List<Ingredient> createTeaIngredients() {
        List<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new Ingredient("tea", "gm", 5));
        ingredients.add(new Ingredient("water", "ml", 200));
        return ingredients;
    }
}
