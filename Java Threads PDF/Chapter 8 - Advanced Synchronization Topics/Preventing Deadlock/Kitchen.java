public class Kitchen {
    static MeasuringCup theCup;
    static Bowl theBowl;
    
    public void makeCookie() {
        synchronized(theCup) {
            theCup.measureOut(1, theFlour);
            synchronized(theBowl) {
                theBowl.putIngredients(theCup);
                theBowl.mix();
            }
        }
    }
    
    public void makeOmelette() {
        synchronized(theBowl) {
            Eggs e[] = getBrokenEggs();
            theBowl.putIngredients(e);
            theBowl.mix();
            synchronized(theCup) {
                theCup.measureOut(theBowl);
            }
        }
    }
}