// There are a few more restrictions that a class must obey to allow inheritance.
//Constructors must not invoke overridable methods, directly or indirectly. If
//you violate this rule, program failure will result. The superclass constructor runs
//before the subclass constructor, so the overriding method in the subclass will get
//invoked before the subclass constructor has run. If the overriding method
//depends on any initialization performed by the subclass constructor, the method
//will not behave as expected. To make this concrete, here’s a class that violates
//this rule:
public class Super {
    // Broken - constructor invokes an overridable method
    public Super() {
        overrideMe();
    }
    public void overrideMe() {
    }
}

public final class Sub extends Super {
    // Blank final, set by constructor
    private final Instant instant;
    Sub() {
        instant = Instant.now();
    }
    // Overriding method invoked by superclass constructor
    @Override public void overrideMe() {
        System.out.println(instant);
    }
    public static void main(String[] args) {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}

// You might expect this program to print out the instant twice, but it prints out
//null the first time because overrideMe is invoked by the Super
//constructor before the Sub constructor has a chance to initialize the instant
//field. Note that this program observes a final field in two different states! Note
//also that if overrideMe had invoked any method on instant, it would have
//thrown a NullPointerException when the Super constructor invoked
//overrideMe. The only reason this program doesn’t throw a
//NullPointerException as it stands is that the println method tolerates
//null parameters.