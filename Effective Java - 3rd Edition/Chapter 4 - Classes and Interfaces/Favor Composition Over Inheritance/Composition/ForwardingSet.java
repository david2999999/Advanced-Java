// Reusable forwarding class
public class ForwardingSet<E> implements Set<E> {
    private final Set<E> s;
    public ForwardingSet(Set<E> s) { this.s = s; }
    public void clear() { s.clear(); }
    public boolean contains(Object o) { return s.contains(o); }
    public boolean isEmpty() { return s.isEmpty(); }
    public int size() { return s.size(); }
    public Iterator<E> iterator() { return s.iterator(); }
    public boolean add(E e) { return s.add(e); }
    public boolean remove(Object o) { return s.remove(o); }
    public boolean containsAll(Collection<?> c)
    { return s.containsAll(c); }
    public boolean addAll(Collection<? extends E> c)
    { return s.addAll(c); }
    public boolean removeAll(Collection<?> c)
    { return s.removeAll(c); }
    public boolean retainAll(Collection<?> c)
    { return s.retainAll(c); }
    public Object[] toArray() { return s.toArray(); }
    public <T> T[] toArray(T[] a) { return s.toArray(a); }
    @Override public boolean equals(Object o)
    { return s.equals(o); }
    @Override public int hashCode() { return s.hashCode(); }
    @Override public String toString() { return s.toString(); }
}

// Luckily, there is a way to avoid all of the problems described above. Instead
//of extending an existing class, give your new class a private field that references
//an instance of the existing class. This design is called composition because the
//existing class becomes a component of the new one. Each instance method in the
//new class invokes the corresponding method on the contained instance of the
//existing class and returns the results. This is known as forwarding, and the
//methods in the new class are known as forwarding methods. The resulting class
//will be rock solid, with no dependencies on the implementation details of the
//existing class. Even adding new methods to the existing class will have no
//impact on the new class. To make this concrete, here’s a replacement for
//InstrumentedHashSet that uses the composition-and-forwarding approach.
//Note that the implementation is broken into two pieces, the class itself and a
//reusable forwarding class, which contains all of the forwarding methods and
//nothing else