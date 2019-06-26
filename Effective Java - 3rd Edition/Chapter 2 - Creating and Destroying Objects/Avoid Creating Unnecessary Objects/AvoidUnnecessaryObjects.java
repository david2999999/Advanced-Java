public class AvoidUnnecessaryObjects {
    // Performance can be greatly improved!
    static boolean isRomanNumeral(String s) {
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})"
                + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }

    //The problem with this implementation is that it relies on the
    //String.matches method. While String.matches is the easiest way to
    //check if a string matches a regular expression, it’s not suitable for repeated
    //use in performance-critical situations. The problem is that it internally creates
    //a Pattern instance for the regular expression and uses it only once, after
    //which it becomes eligible for garbage collection. Creating a Pattern instance
    //is expensive because it requires compiling the regular expression into a finite
    //state machine.

    // Reusing expensive object for improved performance
    public class RomanNumerals {
        private static final Pattern ROMAN = Pattern.compile(
                "^(?=.)M*(C[MD]|D?C{0,3})"
                        + "(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
        static boolean isRomanNumeral(String s) {
            return ROMAN.matcher(s).matches();
        }}
}

// The improved version of isRomanNumeral provides significant
//performance gains if invoked frequently. On my machine, the original version
// takes 1.1 μs on an 8-character input string, while the improved version takes
//0.17 μs, which is 6.5 times faster. Not only is the performance improved, but
//arguably, so is clarity. Making a static final field for the otherwise invisible
//Pattern instance allows us to give it a name, which is far more readable than
//the regular expression itself.