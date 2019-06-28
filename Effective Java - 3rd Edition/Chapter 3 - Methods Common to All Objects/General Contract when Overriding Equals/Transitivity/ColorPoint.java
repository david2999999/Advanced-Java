public class ColorPoint extends Point {
    private final Color color;
    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    // Broken - violates symmetry!
    @Override public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}

Point p = new Point(1, 2);
ColorPoint cp = new ColorPoint(1, 2, Color.RED);
// Then p.equals(cp) returns true, while cp.equals(p) returns
//false.