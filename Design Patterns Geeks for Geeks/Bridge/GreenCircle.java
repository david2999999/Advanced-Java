package Advanced.Bridge;

public class GreenCircle implements DrawAPI{

    @Override
    public void draw(int radius, int x, int y) {
        System.out.println("Drawing circle: green, radius " + radius);
    }
}
