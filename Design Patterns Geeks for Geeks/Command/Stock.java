package Advanced.Command;

public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock{" +
                "name='" + name + '\'' +
                ", brought=" + quantity +
                '}');
    }

    public void sell() {
        System.out.println("Stock{" +
                "name='" + name + '\'' +
                ", sold=" + quantity +
                '}');
    }

    @Override
    public String toString() {
        return "Stock{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
