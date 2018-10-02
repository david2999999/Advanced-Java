package Advanced.Builder;

public class Main {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal ");
        vegMeal.showItems();
        System.out.println("Total cost " + vegMeal.getCost());

        System.out.println();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg meal ");
        nonVegMeal.showItems();
        System.out.println("Total cose " + nonVegMeal.getCost());
    }
}
