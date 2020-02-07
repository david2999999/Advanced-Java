// Two classes defined in one file. Don't ever do this!
class Utensil {
    static final String NAME = "pan";
}
class Dessert {
    static final String NAME = "cake";
}

// If you’re lucky enough to compile the program with the command javac
//Main.java Dessert.java, the compilation will fail, and the compiler will
//tell you that you’ve multiply defined the classes Utensil and Dessert. This
//is so because the compiler will first compile Main.java, and when it sees the
//reference to Utensil (which precedes the reference to Dessert), it will look
//in Utensil.java for this class and find both Utensil and Dessert.
//When the compiler encounters Dessert.java on the command line, it will
//pull in that file too, causing it to encounter both definitions of Utensil and
//Dessert.