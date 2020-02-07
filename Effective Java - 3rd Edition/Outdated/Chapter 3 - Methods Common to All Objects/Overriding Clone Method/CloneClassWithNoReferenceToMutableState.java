public class CloneClassWithNoReferenceToMutableState {
    // Clone method for class with no references to mutable state
    @Override public PhoneNumber clone() {
    try {
        return (PhoneNumber) super.clone();
    } catch (CloneNotSupportedException e) {
        throw new AssertionError(); // Can't happen
    }}
}

// In order for this method to work, the class declaration for PhoneNumber
would have to be modified to indicate that it implements Cloneable. Though
Object’s clone method returns Object, this clone method returns
PhoneNumber. It is legal and desirable to do this because Java supports
covariant return types. In other words, an overriding method’s return type can be
a subclass of the overridden method’s return type. This eliminates the need for
casting in the client. We must cast the result of super.clone from Object
to PhoneNumber before returning it, but the cast is guaranteed to succeed.

// The call to super.clone is contained in a try-catch block. This is
  because Object declares its clone method to throw
  CloneNotSupportedException, which is a checked exception. Because
  PhoneNumber implements Cloneable, we know the call to super.clone
  will succeed. The need for this boilerplate indicates that
  CloneNotSupportedException should have been unchecked