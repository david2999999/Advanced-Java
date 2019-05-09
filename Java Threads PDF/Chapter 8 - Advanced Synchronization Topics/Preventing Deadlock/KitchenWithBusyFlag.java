public class Kitchen {
    static MeasuringCup theCup;
    static Bowl theBowl;
    static BusyFlag theCupFlag, theBowlFlag;
    
    public void makeCookie() {
        theCupFlag.getBusyFlag();
        theCup.measureOut(1, theFlour);
        
        if (theBowlFlag.tryGetBusyFlag()) {
            theBowl.putIngredients(theCup);
            theBowl.mix();
            theBowlFlag.freeBusyFlag();
            theCupFlag.freeBusyFlag();
        }
        else {
            WaxedPaper thePaper = new WaxedPaper();
            thePaper.emptyOnto(theCup);
            theCupFlag.freeBusyFlag();
            theBowlFlag.getBusyFlag();
            theBowl.putIngredients(thePaper);
            theBowl.mix();
            theBowlFlag.freeBusyFlag();
        }
    }
    
    public void makeOmelette() {
        theBowlFlag.getBusyFlag();
        Eggs e[] = getBrokenEggs();
        theBowl.putIngredients(e);
        theBowl.mix();
        theCupFlag.getBusyFlag();
        theCup.measureOut(theBowl);
        theCupFlag.freeBusyFlag();
        theBowlFlag.freeBusyFlag();
    }
}