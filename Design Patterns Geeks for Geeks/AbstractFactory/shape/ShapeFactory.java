package Advanced.AbstractFactory.shape;

import Advanced.AbstractFactory.AbstractFactory;
import Advanced.AbstractFactory.color.Circle;
import Advanced.AbstractFactory.color.Color;

public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;

        if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }

        return null;
    }
}
