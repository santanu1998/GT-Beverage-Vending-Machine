package common;

import java.util.ArrayList;
import java.util.List;

public class MyBeverage implements BeverageInterface {
    private List<Ingredient> ingredients;

    public MyBeverage(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public void serve(String beverage) {
        System.out.println("Serving " + beverage);
    }

    @Override
    public void makeBeverage() {
        for (Ingredient ingredient : ingredients) {
            System.out.println("Adding " + ingredient.getName() + ": " + ingredient.getValue() + ingredient.getUnit());
        }
        System.out.println("Preparing beverage...");
    }
}
