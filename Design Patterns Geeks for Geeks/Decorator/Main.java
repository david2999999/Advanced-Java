package Advanced.Decorator;

import Advanced.Decorator.shape.Circle;
import Advanced.Decorator.shape.Rectangle;
import Advanced.Decorator.shape.Shape;

// Adding new functionality by acting as a wrapper for existing object without altering the structure
// of the object
public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();

        Shape redCircle = new RedShapeDecorator(new Circle());

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redCircle.draw();

        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}

