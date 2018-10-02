package Advanced.Builder;

import Advanced.Builder.Burger.ChickenBurger;
import Advanced.Builder.Burger.VegBurger;
import Advanced.Builder.Drinks.Coke;
import Advanced.Builder.Drinks.Pepsi;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
