public class ComparingMostSignificantFieldFirst {
    // If a class has multiple significant fields, the order in which you compare them
    //is critical. Start with the most significant field and work your way down. If a
    //comparison results in anything other than zero (which represents equality),
    // you’re done; just return the result. If the most significant field is equal, compare
    //the next-most-significant field, and so on, until you find an unequal field or
    //compare the least significant field. Here is a compareTo method for the
    //PhoneNumber class in Item 11 demonstrating this technique:
    // Multiple-field Comparable with primitive fields
    public int compareTo(PhoneNumber pn) {
        int result = Short.compare(areaCode, pn.areaCode);
        if (result == 0) {
            result = Short.compare(prefix, pn.prefix);
            if (result == 0)
                result = Short.compare(lineNum, pn.lineNum);
        }
        return result;
    }
}