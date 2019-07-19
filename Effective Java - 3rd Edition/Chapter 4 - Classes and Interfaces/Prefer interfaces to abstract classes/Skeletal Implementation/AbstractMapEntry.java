// As a simple example, consider the Map.Entry interface. The obvious
//primitives are getKey, getValue, and (optionally) setValue. The interface
//specifies the behavior of equals and hashCode, and there is an obvious
//implementation of toString in terms of the primitives. Since you are not
//allowed to provide default implementations for the Object methods, all
//implementations are placed in the skeletal implementation class

// Skeletal implementation class
public abstract class AbstractMapEntry<K,V>
        implements Map.Entry<K,V> {
    // Entries in a modifiable map must override this method
    @Override public V setValue(V value) {
        throw new UnsupportedOperationException();
    }

    // Implements the general contract of Map.Entry.equals
    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Map.Entry))
            return false;
        Map.Entry<?,?> e = (Map.Entry) o;
        return Objects.equals(e.getKey(), getKey())
                && Objects.equals(e.getValue(), getValue());
    }
    // Implements the general contract of Map.Entry.hashCode
    @Override public int hashCode() {
        return Objects.hashCode(getKey())
                ^ Objects.hashCode(getValue());
    }
    @Override public String toString() {
        return getKey() + "=" + getValue();
    }
}