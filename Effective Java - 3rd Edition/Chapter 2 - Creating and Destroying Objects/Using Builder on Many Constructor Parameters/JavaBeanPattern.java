public class JavaBeanPattern {
    // JavaBeans Pattern - allows inconsistency, mandates mutability
    public class NutritionFacts {
        // Parameters initialized to default values (if any)
        private int servingSize = -1; // Required; no default value
        private int servings = -1; // Required; no default value
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;
        public NutritionFacts() { }
        // Setters
        public void setServingSize(int val) { servingSize = val; }
        public void setServings(int val) { servings = val; }
        public void setCalories(int val) { calories = val; }
        public void setFat(int val) { fat = val; }
        public void setSodium(int val) { sodium = val; }
        public void setCarbohydrate(int val) { carbohydrate = val; }
    }
}

NutritionFacts cocaCola = new NutritionFacts();
cocaCola.setServingSize(240);
cocaCola.setServings(8);
cocaCola.setCalories(100);
cocaCola.setSodium(35);
cocaCola.setCarbohydrate(27);

//Unfortunately, the JavaBeans pattern has serious disadvantages of its own.
//Because construction is split across multiple calls, a JavaBean may be in an
//inconsistent state partway through its construction. The class does not have
//the option of enforcing consistency merely by checking the validity of the
//constructor parameters. Attempting to use an object when it’s in an inconsistent
//state may cause failures that are far removed from the code containing the bug
//and hence difficult to debug. A related disadvantage is that the JavaBeans
//pattern precludes the possibility of making a class immutable (Item 17) and
//requires added effort on the part of the programmer to ensure thread safety.