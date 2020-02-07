public class StaticFactory {
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}

// The traditional way for a class to allow a client to obtain an instance is to
//provide a public constructor. There is another technique that should be a part of
//every programmer’s toolkit. A class can provide a public static factory method,
//which is simply a static method that returns an instance of the class. Here’s a
//simple example from Boolean (the boxed primitive class for boolean). This
//method translates a boolean primitive value into a Boolean object reference