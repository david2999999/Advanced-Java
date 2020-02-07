public class StaticFactoryMethods {
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }
}

//One advantage of static factory methods is that, unlike constructors, they
//have names. If the parameters to a constructor do not, in and of themselves,
//describe the object being returned, a static factory with a well-chosen name is
//easier to use and the resulting client code easier to read.