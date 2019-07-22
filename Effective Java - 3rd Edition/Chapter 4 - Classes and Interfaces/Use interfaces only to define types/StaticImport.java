// Normally a utility class requires clients to qualify constant names with a class
//name, for example, PhysicalConstants.AVOGADROS_NUMBER. If you
//make heavy use of the constants exported by a utility class, you can avoid the
//need for qualifying the constants with the class name by making use of the static
//import facility:

// Use of static import to avoid qualifying constants
import static com.effectivejava.science.PhysicalConstants.*;

public class Test {
    double atoms(double mols) {
        return AVOGADROS_NUMBER * mols;
    }
    // Many more uses of PhysicalConstants justify static import
}