package Advanced.Builder.Drinks;

import Advanced.Builder.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
