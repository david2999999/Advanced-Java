// In a compareTo method, fields are compared for order rather than equality.
//To compare object reference fields, invoke the compareTo method recursively.
//If a field does not implement Comparable or you need a nonstandard
//ordering, use a Comparator instead. You can write your own comparator or
//use an existing one, as in this compareTo method for
//CaseInsensitiveString

// Single-field Comparable with object reference field
public final class CaseInsensitiveString implements Comparable<CaseInsensitiveString> {
    public int compareTo(CaseInsensitiveString cis) {
        return String.CASE_INSENSITIVE_ORDER.compare(s, cis.s);
    }
}

// Note that CaseInsensitiveString implements
//Comparable<CaseInsensitiveString>. This means that a
//CaseInsensitiveString reference can be compared only to another
//CaseInsensitiveString reference. This is the normal pattern to follow
//when declaring a class to implement Comparable.