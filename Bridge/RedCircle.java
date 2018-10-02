package Advanced.Bridge;

public class RedCircle implements DrawAPI {

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Drawing circle: red, radius " + radius);
    }
}
