// Immutable complex number class
public final class Complex {
    private final double re;
    private final double im;

    private Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public static Complex valueOf(double re, double im) {
        return new Complex(re, im);
    }

    public double realPart() { return re; }
    public double imaginaryPart() { return im; }
    public Complex plus(Complex c) {
        return new Complex(re + c.re, im + c.im);
    }
    public Complex minus(Complex c) {
        return new Complex(re - c.re, im - c.im);
    }
    public Complex times(Complex c) {
        return new Complex(re * c.re - im * c.im,
                re * c.im + im * c.re);
    }
    public Complex dividedBy(Complex c) {
        double tmp = c.re * c.re + c.im * c.im;
        return new Complex((re * c.re + im * c.im) / tmp,
                (im * c.re - re * c.im) / tmp);
    }
    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;
// See page 47 to find out why we use compare instead of ==
        return Double.compare(c.re, re) == 0
                && Double.compare(c.im, im) == 0;
    } @
            Override public int hashCode() {
        return 31 * Double.hashCode(re) + Double.hashCode(im);
    }
    @Override public String toString() {
        return "(" + re + " + " + im + "i)";
    }
}

 //1. Don’t provide methods that modify the object’s state (known as
//mutators).

//2. Ensure that the class can’t be extended. This prevents careless or
//malicious subclasses from compromising the immutable behavior of the
//class by behaving as if the object’s state has changed. Preventing subclassing
//is generally accomplished by making the class final, but there is an
//alternative that we’ll discuss later.

//3. Make all fields final. This clearly expresses your intent in a manner that is
//enforced by the system. Also, it is necessary to ensure correct behavior if a
//reference to a newly created instance is passed from one thread to another
//without synchronization, as spelled out in the memory model [JLS, 17.5;
//Goetz06, 16].

//4. Make all fields private. This prevents clients from obtaining access to
//mutable objects referred to by fields and modifying these objects directly.
//While it is technically permissible for immutable classes to have public final
//fields containing primitive values or references to immutable objects, it is
//not recommended because it precludes changing the internal representation
//in a later release (Items 15 and 16).

//5. Ensure exclusive access to any mutable components. If your class has
//any fields that refer to mutable objects, ensure that clients of the class cannot
//obtain references to these objects. Never initialize such a field to a clientprovided
//object reference or return the field from an accessor. Make
//defensive copies (Item 50) in constructors, accessors, and readObject
//methods (Item 88).