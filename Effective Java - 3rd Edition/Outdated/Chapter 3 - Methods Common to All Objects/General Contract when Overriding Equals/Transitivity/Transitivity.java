public class Transitivity {
    // Initialize unitCircle to contain all Points on the unit circle
    private static final Set<Point> unitCircle = Set.of(
            new Point( 1, 0), new Point( 0, 1),
            new Point(-1, 0), new Point( 0, -1));

    public static boolean onUnitCircle(Point p) {
        return unitCircle.contains(p);
    }

    // Adds a value component without violating the equals contract
    public class ColorPoint {
        private final Point point;
        private final Color color;

        public ColorPoint(int x, int y, Color color) {
            point = new Point(x, y);
            this.color = Objects.requireNonNull(color);
        }

        /**
         * Returns the point-view of this color point.
         */
        public Point asPoint() {
            return point;
        }

        @Override
        public boolean equals(Object o) {
            if (!(o instanceof ColorPoint))
                return false;
            ColorPoint cp = (ColorPoint) o;
            return cp.point.equals(point) && cp.color.equals(color);
        }
    }
}