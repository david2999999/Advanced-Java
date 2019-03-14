package Advanced.Builder.Burger;

import Advanced.Builder.Item;
import Advanced.Builder.Packing;

public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();

}
