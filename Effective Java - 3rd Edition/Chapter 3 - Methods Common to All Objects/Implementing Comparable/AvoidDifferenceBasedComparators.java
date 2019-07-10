public class AvoidDifferenceBasedComparators {
    // Occasionally you may see compareTo or compare methods that rely on
    //the fact that the difference between two values is negative if the first value is less
    //than the second, zero if the two values are equal, and positive if the first value is
    //greater.

    // BROKEN difference-based comparator - violates transitivity!
    static Comparator<Object> hashCodeOrder = new Comparator<>() {
        public int compare(Object o1, Object o2) {
            return o1.hashCode() - o2.hashCode();
        }
    };

    // Comparator based on static compare method
    static Comparator<Object> hashCodeOrder = new Comparator<>() {
        public int compare(Object o1, Object o2) {
            return Integer.compare(o1.hashCode(), o2.hashCode());
        }
    };
    // Comparator based on Comparator construction method
    static Comparator<Object> hashCodeOrder =
            Comparator.comparingInt(o -> o.hashCode());

}