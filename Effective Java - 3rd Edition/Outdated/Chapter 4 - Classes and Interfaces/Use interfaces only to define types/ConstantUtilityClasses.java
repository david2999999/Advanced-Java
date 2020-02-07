// Constant utility class
package com.effectivejava.science;
public class PhysicalConstants {
    private PhysicalConstants() { } // Prevents instantiation
    public static final double AVOGADROS_NUMBER = 6.022_140_857e23;
    public static final double BOLTZMANN_CONST = 1.380_648_52e-23;
    public static final double ELECTRON_MASS = 9.109_383_56e-31;
}

// If you want to export constants, there are several reasonable choices. If the
//constants are strongly tied to an existing class or interface, you should add them
//to the class or interface. For example, all of the boxed numerical primitive
//classes, such as Integer and Double, export MIN_VALUE and
//MAX_VALUE constants. If the constants are best viewed as members of an
//enumerated type, you should export them with an enum type (Item 34).
//Otherwise, you should export the constants with a noninstantiable utility class
//(Item 4). Here is a utility class version of the PhysicalConstants example
//shown earlier: