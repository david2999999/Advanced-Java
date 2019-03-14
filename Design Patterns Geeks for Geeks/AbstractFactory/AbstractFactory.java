package Advanced.AbstractFactory;

import Advanced.AbstractFactory.color.Color;
import Advanced.AbstractFactory.shape.Shape;

public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
