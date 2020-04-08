public final class Complex {
    private final double real;
    private final double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double realPart() {
        return real;
    }

    public double imaginaryPart() {
        return imaginary;
    }

    public Complex plus(Complex c) {
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    public Complex minus(Complex c) {
        return new Complex(real - c.real, imaginary - c.imaginary);
    }

    public Complex times(Complex c) {
        return new Complex(real * c.real - imaginary * c.imaginary,
                real * c.imaginary + imaginary * c.real);
    }

    public Complex dividedBy(Complex c) {
        double tmp = c.real * c.real + c.imaginary * c.imaginary;
        return new Complex((real * c.real + imaginary * c.imaginary) / tmp,
                (imaginary * c.real - real * c.imaginary) / tmp);
    }

    @Override public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Complex))
            return false;
        Complex c = (Complex) o;

        return Double.compare(c.real, real) == 0
                && Double.compare(c.imaginary, imaginary) == 0;
    }

    @Override
    public int hashCode() {
        return 31 * Double.hashCode(real) + Double.hashCode(imaginary);
    }

    @Override
    public String toString() {
        return "(" + real + " + " + imaginary + "i)";
    }
}