package Advanced.Singleton;

public class Main {
    public static void main(String[] args) {
        SingleObject obj = SingleObject.getInstance();

        obj.showMessage();
    }
}
