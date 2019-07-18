// Broken - Inappropriate use of inheritance!
public class InstrumentedHashSet<E> extends HashSet<E> {
    // The number of attempted element insertions
    private int addCount = 0;
    public InstrumentedHashSet() {
    }
    public InstrumentedHashSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    } @
            Override public boolean add(E
                                                e) {
        addCount++;
        return super.add(e);
    } @
            Override public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    } public int getAddCount() {
        return addCount;
    }
}

InstrumentedHashSet<String> s = new InstrumentedHashSet<>();
s.addAll(List.of("Snap", "Crackle", "Pop"));

// We would expect the getAddCount method to return three at this point, but
//it returns six. What went wrong? Internally, HashSet’s addAll method is
//implemented on top of its add method, although HashSet, quite reasonably,
//does not document this implementation detail. The addAll method in
//Instrumented-HashSet added three to addCount and then invoked
//HashSet’s addAll implementation using super.addAll. This in turn
//invoked the add method, as overridden in InstrumentedHashSet, once for
//each element. Each of these three invocations added one more to addCount,
//for a total increase of six: each element added with the addAll method is
//double-counted.