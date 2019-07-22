// Tagged class - vastly inferior to a class hierarchy!
class Figure {
    enum Shape { RECTANGLE, CIRCLE };
    // Tag field - the shape of this figure
    final Shape shape;
    // These fields are used only if shape is RECTANGLE
    double length;
    double width;
    // This field is used only if shape is CIRCLE
    double radius;
    // Constructor for circle
    Figure(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }
    // Constructor for rectangle
    Figure(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }
    double area() {
        switch(shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }
}

// Such tagged classes have numerous shortcomings. They are cluttered with
//boilerplate, including enum declarations, tag fields, and switch statements.
//Readability is further harmed because multiple implementations are jumbled
//together in a single class. Memory footprint is increased because instances are
//burdened with irrelevant fields belonging to other flavors. Fields can’t be made
//final unless constructors initialize irrelevant fields, resulting in more boilerplate.
//Constructors must set the tag field and initialize the right data fields with no help
//from the compiler: if you initialize the wrong fields, the program will fail at
//runtime. You can’t add a flavor to a tagged class unless you can modify its
//source file. If you do add a flavor, you must remember to add a case to every
//switch statement, or the class will fail at runtime. Finally, the data type of an
//instance gives no clue as to its flavor. In short, tagged classes are verbose,
//error-prone, and inefficient.