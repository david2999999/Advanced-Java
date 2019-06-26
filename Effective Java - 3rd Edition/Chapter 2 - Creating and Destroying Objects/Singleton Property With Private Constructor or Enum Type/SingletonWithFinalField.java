public class SingletonWithFinalField {
    // Singleton with public final field
    public class Elvis {
        public static final Elvis INSTANCE = new Elvis();
        private Elvis() { ... }
        public void leaveTheBuilding() { ... }
    }
}

//The private constructor is called only once, to initialize the public static final
//field Elvis.INSTANCE. The lack of a public or protected constructor
//guarantees a “monoelvistic” universe: exactly one Elvis instance will exist
//once the Elvis class is initialized—no more, no less. Nothing that a client does
//can change this, with one caveat: a privileged client can invoke the private
//constructor reflectively (Item 65) with the aid of the
//AccessibleObject.setAccessible method. If you need to defend
//against this attack, modify the constructor to make it throw an exception if it’s
//asked to create a second instance.