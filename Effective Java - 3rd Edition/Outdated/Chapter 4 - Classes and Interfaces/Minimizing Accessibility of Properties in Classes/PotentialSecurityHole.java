public class PotentialSecurityHole {
    //Note that a nonzero-length array is always mutable, so it is wrong for a class
    //to have a public static final array field, or an accessor that returns such a
    //field. If a class has such a field or accessor, clients will be able to modify the
    //contents of the array. This is a frequent source of security holes:
    // Potential security hole!
    public static final Thing[] VALUES = { ... };

    // Beware of the fact that some IDEs generate accessors that return references to
    //private array fields, resulting in exactly this problem. There are two ways to fix
    //the problem. You can make the public array private and add a public immutable
    //list
    private static final Thing[] PRIVATE_VALUES = { ... };
    public static final List<Thing> VALUES =
            Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));

    // Alternatively, you can make the array private and add a public method that
    //returns a copy of a private array:
    private static final Thing[] PRIVATE_VALUES = { ... };
    public static final Thing[] values() {
            return PRIVATE_VALUES.clone();
            }
}