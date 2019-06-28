//Transitivity—The third requirement of the equals contract says that if one
// object is equal to a second and the second object is equal to a third, then the first
// object must be equal to the third. Again, it’s not hard to imagine violating this
// requirement unintentionally. Consider the case of a subclass that adds a new
// value component to its superclass. In other words, the subclass adds a piece of
// information that affects equals comparisons.
public class Point {
    private final int x;
    private final int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override public boolean equals(Object o) {
        if (!(o instanceof Point))
            return false;
        Point p = (Point)o;
        return p.x == x && p.y == y;
    }
 // Remainder omitted
}