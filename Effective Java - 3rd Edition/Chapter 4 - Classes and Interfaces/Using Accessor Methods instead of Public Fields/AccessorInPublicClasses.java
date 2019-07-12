public class  AccessorInPublicClasses {
    // Degenerate classes like this should not be public!
    class Point {
        public double x;
        public double y;
    }

    class Point {
        private double x;
        private double y;
        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
        public double getX() { return x; }
        public double getY() { return y; }
        public void setX(double x) { this.x = x; }
        public void setY(double y) { this.y = y; }
    }

    // Certainly, the hard-liners are correct when it comes to public classes: if a class
    //is accessible outside its package, provide accessor methods to preserve the
    //flexibility to change the class’s internal representation. If a public class exposes
    //its data fields, all hope of changing its representation is lost because client code
    //can be distributed far and wide.
}