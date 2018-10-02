package Advanced.AbstractFactory;

import Advanced.AbstractFactory.color.Color;
import Advanced.AbstractFactory.shape.Shape;

public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");
        Color color = colorFactory.getColor("red");
        color.fill();
    }
}
