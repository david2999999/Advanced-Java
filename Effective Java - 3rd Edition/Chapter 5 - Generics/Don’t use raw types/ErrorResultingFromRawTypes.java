// Raw collection type - don't do this!
// My stamp collection. Contains only Stamp instances.
private final Collection stamps = ... ;

// Erroneous insertion of coin into stamp collection
stamps.add(new Coin( ... )); // Emits "unchecked call" warning

// Raw iterator type - don't do this!
for (Iterator i = stamps.iterator(); i.hasNext(); )
Stamp stamp = (Stamp) i.next(); // Throws ClassCastException
stamp.cancel();

// As mentioned throughout this book, it pays to discover errors as soon as
//possible after they are made, ideally at compile time. In this case, you don’t
//discover the error until runtime, long after it has happened, and in code that may
//be distant from the code containing the error. Once you see the
//ClassCastException, you have to search through the codebase looking for
//the method invocation that put the coin into the stamp collection. The compiler
//can’t help you, because it can’t understand the comment that says, “Contains
//only Stamp instances.”