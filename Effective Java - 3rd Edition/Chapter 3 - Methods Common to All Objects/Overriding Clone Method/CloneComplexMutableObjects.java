public class CloneComplexMutableObjects {
    // Recursive clone method for class with complex mutable state
    public class HashTable implements Cloneable {
        private Entry[] buckets = ...;
        private static class Entry {
            final Object key;
            Object value;
            Entry next;
            Entry(Object key, Object value, Entry next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
            // Recursively copy the linked list headed by this Entry
            Entry deepCopy() {
                return new Entry(key, value,
                        next == null ? null : next.deepCopy());
            }

            // The private class HashTable.Entry has been augmented to support a
            //“deep copy” method. The clone method on HashTable allocates a new
            //buckets array of the proper size and iterates over the original buckets array,
            //deep-copying each nonempty bucket. The deepCopy method on Entry
            //invokes itself recursively to copy the entire linked list headed by the entry. While
            //this technique is cute and works fine if the buckets aren’t too long, it is not a
            //good way to clone a linked list because it consumes one stack frame for each
            //element in the list. If the list is long, this could easily cause a stack overflow. To
            //prevent this from happening, you can replace the recursion in deepCopy with
            //iteration:
            // Iteratively copy the linked list headed by this Entry
            Entry deepCopy() {
                Entry result = new Entry(key, value, next);
                for (Entry p = result; p.next != null; p = p.next)
                    p.next = new Entry(p.next.key, p.next.value, p.next.next);
                return result;
            }
        }

        @Override public HashTable clone() {
            try {
                HashTable result = (HashTable) super.clone();
                result.buckets = new Entry[buckets.length];
                for (int i = 0; i < buckets.length; i++)
                    if (buckets[i] != null)
                        result.buckets[i] = buckets[i].deepCopy();
                return result;
            } catch (CloneNotSupportedException e) {
                throw new AssertionError();
            }
        }
    }
}