// You might be tempted to use a raw type for a collection whose element type is
//unknown and doesn’t matter. For example, suppose you want to write a method
//that takes two sets and returns the number of elements they have in common.
//Here’s how you might write such a method if you were new to generics
// Use of raw type for unknown element type - don't do this!
static int numElementsInCommon(Set s1, Set s2) {
    int result = 0;
    for (Object o1 : s1)
        if (s2.contains(o1))
            result++;
    return result;
}

// This method works but it uses raw types, which are dangerous. The safe
// alternative is to use unbounded wildcard types. If you want to use a generic type
//but you don’t know or care what the actual type parameter is, you can use a
//question mark instead. For example, the unbounded wildcard type for the
//generic type Set<E> is Set<?> (read “set of some type”). It is the most
//general parameterized Set type, capable of holding any set. Here is how the
//numElementsInCommon declaration looks with unbounded wildcard types:
// Uses unbounded wildcard type - typesafe and flexible
static int numElementsInCommon(Set<?> s1, Set<?> s2) { ... }

// What is the difference between the unbounded wildcard type Set<?> and the
//raw type Set? Does the question mark really buy you anything? Not to belabor
//the point, but the wildcard type is safe and the raw type isn’t. You can put any
//element into a collection with a raw type, easily corrupting the collection’s type
//invariant (as demonstrated by the unsafeAdd method on page 119); you can’t
//put any element (other than null) into a Collection<?>.