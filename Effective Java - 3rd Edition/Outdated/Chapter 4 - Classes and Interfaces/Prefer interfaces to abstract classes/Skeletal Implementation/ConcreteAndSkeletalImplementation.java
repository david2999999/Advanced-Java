// Concrete implementation built atop skeletal implementation
static List<Integer> intArrayAsList(int[] a) {
    Objects.requireNonNull(a);

    // The diamond operator is only legal here in Java 9 and later
    // If you're using an earlier release, specify <Integer>
    return new AbstractList<>() {
        @Override public Integer get(int i) {
            return a[i]; // Autoboxing (Item 6)
        }
        @Override public Integer set(int i, Integer val) {
            int oldVal = a[i];
            a[i] = val; // Auto-unboxing
            return oldVal; // Autoboxing
        }
        @Override public int size() {
            return a.length;
        }
    };
}

// When you consider all that a List implementation does for you, this example
//is an impressive demonstration of the power of skeletal implementations.
//Incidentally, this example is an Adapter [Gamma95] that allows an int array to
//be viewed as a list of Integer instances. Because of all the translation back
//and forth between int values and Integer instances (boxing and unboxing),
//its performance is not terribly good. Note that the implementation takes the form
//of an anonymous class (Item 24).