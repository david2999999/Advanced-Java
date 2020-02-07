// In Java 8, the Comparator interface was outfitted with a set of comparator
//construction methods, which enable fluent construction of comparators. These
//comparators can then be used to implement a compareTo method, as required
//by the Comparable interface. Many programmers prefer the conciseness of
//this approach, though it does come at a modest performance cost: sorting arrays
//of PhoneNumber instances is about 10% slower on my machine. When using
//this approach, consider using Java’s static import facility so you can refer to
//static comparator construction methods by their simple names for clarity and
//brevity
public class ComparatorConstructionMethods {
    // Comparable with comparator construction methods
    private static final Comparator<PhoneNumber> COMPARATOR =
            comparingInt((PhoneNumber pn) -> pn.areaCode)
                    .thenComparingInt(pn -> pn.prefix)
                    .thenComparingInt(pn -> pn.lineNum);

    public int compareTo(PhoneNumber pn) {
        return COMPARATOR.compare(this, pn);
    }
}