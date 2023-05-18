package controller;

import common.BeverageInterface;
import common.MyBeverage;

public class BeverageController {
    private BeverageInterface beverage;

    public BeverageController(BeverageInterface beverage) {
        this.beverage = beverage;
    }

    public void makeBeverage() {
        beverage.makeBeverage();
        beverage.serve(beverage.getClass().getSimpleName());
    }
}
