// Chooser - a class badly in need of generics!
public class Chooser {
    private final Object[] choiceArray;
    public Chooser(Collection choices) {
        choiceArray = choices.toArray();
    }
    public Object choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceArray[rnd.nextInt(choiceArray.length)];
    }
}
// To use this class, you have to cast the choose method’s return value from
//Object to the desired type every time you use invoke the method, and the cast
//will fail at runtime if you get the type wrong. Taking the advice of Item 29 to
//heart, we attempt to modify Chooser to make it generic

// List-based Chooser - typesafe
public class Chooser<T> {
    private final List<T> choiceList;
    public Chooser(Collection<T> choices) {
        choiceList = new ArrayList<>(choices);
    }
    public T choose() {
        Random rnd = ThreadLocalRandom.current();
        return choiceList.get(rnd.nextInt(choiceList.size()));
    }
}