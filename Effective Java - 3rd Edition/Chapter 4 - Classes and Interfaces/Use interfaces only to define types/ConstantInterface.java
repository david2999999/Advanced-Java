// Constant interface antipattern - do not use!
public interface PhysicalConstants {
    // Avogadro's number (1/mol)
    static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    // Boltzmann constant (J/K)
    static final double BOLTZMANN_CONSTANT = 1.380_648_52e-23;
    // Mass of the electron (kg)
    static final double ELECTRON_MASS = 9.109_383_56e-31;
}

 //One kind of interface that fails this test is the so-called constant interface.
//Such an interface contains no methods; it consists solely of static final fields,
//each exporting a constant. Classes using these constants implement the interface
//to avoid the need to qualify constant names with a class name

// The constant interface pattern is a poor use of interfaces. That a class uses
//some constants internally is an implementation detail. Implementing a constant
//interface causes this implementation detail to leak into the class’s exported API.
//It is of no consequence to the users of a class that the class implements a
//constant interface. In fact, it may even confuse them. Worse, it represents a
//commitment: if in a future release the class is modified so that it no longer needs
//to use the constants, it still must implement the interface to ensure binary
//compatibility. If a nonfinal class implements a constant interface, all of its
// subclasses will have their namespaces polluted by the constants in the interface.