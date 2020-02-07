public class MemoryLeak {
    // Can you spot the "memory leak"?
    public class Stack {
        private Object[] elements;
        private int size = 0;
        private static final int DEFAULT_INITIAL_CAPACITY = 16;

        public Stack() {
            elements = new Object[DEFAULT_INITIAL_CAPACITY];
        }

        public void push(Object e) {
            ensureCapacity();
            elements[size++] = e;
        }

        public Object pop() {
            if (size == 0)
                throw new EmptyStackException();
            return elements[--size];
        }

        public Object pop() {
            if (size == 0)
                throw new EmptyStackException();
            Object result = elements[--size];
            elements[size] = null; // Eliminate obsolete reference
            return result;
        }

        /**
         * Ensure space for at least one more element, roughly
         * doubling the capacity each time the array needs to grow.
         */
        private void ensureCapacity() {
            if (elements.length == size)
                elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}

//There’s nothing obviously wrong with this program (but see Item 29 for a
// generic version). You could test it exhaustively, and it would pass every test with
// flying colors, but there’s a problem lurking. Loosely speaking, the program has a
// “memory leak,” which can silently manifest itself as reduced performance due to
// increased garbage collector activity or increased memory footprint. In extreme
// cases, such memory leaks can cause disk paging and even program failure with
// an OutOfMemoryError, but such failures are relatively rare.
// So where is the memory leak? If a stack grows and then shrinks, the objects
// that were popped off the stack will not be garbage collected, even if the program
// using the stack has no more references to them. This is because the stack
// maintains obsolete references to these objects. An obsolete reference is simply a
// reference that will never be dereferenced again. In this case, any references
// outside of the “active portion” of the element array are obsolete. The active
// portion consists of the elements whose index is less than size.