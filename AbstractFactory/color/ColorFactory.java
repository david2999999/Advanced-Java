package Advanced.AbstractFactory.color;

import Advanced.AbstractFactory.AbstractFactory;
import Advanced.AbstractFactory.shape.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        if (color == null) return null;

        if (color.equalsIgnoreCase("Red")) {
            return new Red();
        } else if (color.equalsIgnoreCase("Green")) {
            return new Green();
        } else if (color.equalsIgnoreCase("Blue")) {
            return new Blue();
        }

        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
