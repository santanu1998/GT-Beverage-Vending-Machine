package common;

import java.util.List;

public interface BeverageInterface {
    List<Ingredient> getIngredients();
    void serve(String beverage);

    void makeBeverage();
}
