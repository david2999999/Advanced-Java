package Advanced.Facade;

// hiding the complexity of the system by providing an interface to the client
// basically a single class that acts as an interface to provide simplify methods required by the client
// calls to these methods will be delegated to methods of other classes
public class Main {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
