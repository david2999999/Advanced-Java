package Advanced.AbstractFactory.color;

import Advanced.AbstractFactory.shape.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle: draw() method");

    }
}