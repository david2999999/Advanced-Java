public class Symmetry {
    // Broken - violates symmetry!
    public final class CaseInsensitiveString {
        private final String s;
        public CaseInsensitiveString(String s) {
            this.s = Objects.requireNonNull(s);
        }
        // Broken - violates symmetry!
        @Override public boolean equals(Object o) {
            if (o instanceof CaseInsensitiveString)
                return s.equalsIgnoreCase(
                        ((CaseInsensitiveString) o).s);
            if (o instanceof String) // One-way interoperability!
                return s.equalsIgnoreCase((String) o);
            return false;
        } //... // Remainder omitted
    }

    @Override public boolean equals(Object o) {
        return o instanceof CaseInsensitiveString &&
                ((CaseInsensitiveString) o).s.equalsIgnoreCase(s);
    }
}

CaseInsensitiveString cis = new CaseInsensitiveString("Polish");
String s = "polish";

// As expected, cis.equals(s) returns true. The problem is that while the
//equals method in CaseInsensitiveString knows about ordinary
//strings, the equals method in String is oblivious to case-insensitive strings.

List<CaseInsensitiveString> list = new ArrayList<>();
list.add(cis);

// What does list.contains(s) return at this point? Who knows? In the
//current OpenJDK implementation, it happens to return false, but that’s just an
//implementation artifact. In another implementation, it could just as easily return
//true or throw a runtime exception. Once you’ve violated the equals
//contract, you simply don’t know how other objects will behave when
//confronted with your object.