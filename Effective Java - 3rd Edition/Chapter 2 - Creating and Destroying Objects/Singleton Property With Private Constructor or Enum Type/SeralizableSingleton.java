//To make a singleton class that uses either of these approaches serializable
//(Chapter 12), it is not sufficient merely to add implements Serializable
//to its declaration. To maintain the singleton guarantee, declare all instance fields
//transient and provide a readResolve method (Item 89). Otherwise, each
//time a serialized instance is deserialized, a new instance will be created, leading,
//in the case of our example, to spurious Elvis sightings. To prevent this from
//happening, add this readResolve method to the Elvis class:
public class SeralizableSingleton {
    // readResolve method to preserve singleton property
    private Object readResolve() {
    // Return the one true Elvis and let the garbage collector
    // take care of the Elvis impersonator.
        return INSTANCE;
    }
}