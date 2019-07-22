// For example, consider the removeIf method, which was added to the
//Collection interface in Java 8. This method removes all elements for which
//a given boolean function (or predicate) returns true. The default
//implementation is specified to traverse the collection using its iterator, invoking
//the predicate on each element, and using the iterator’s remove method to
//remove the elements for which the predicate returns true.
// Default method added to the Collection interface in Java 8
default boolean removeIf(Predicate<? super E> filter) {
    Objects.requireNonNull(filter);
    boolean result = false;
    for (Iterator<E> it = iterator(); it.hasNext(); ) {
        if (filter.test(it.next())) {
            it.remove();
            result = true;
        }
    }
    return result;
}