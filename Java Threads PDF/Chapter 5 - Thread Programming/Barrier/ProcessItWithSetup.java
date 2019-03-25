public class ProcessIt implements Runnable {
    public void run() {
        try {
            int i = bpStart.waitForRest();
            doPhaseOne(is[i]);
            if (bp1.waitForRest() == 0)
                doPhaseTwoSetup();
                
            bp1b.waitForRest();
            doPhaseTwo(is[i]);
            if (bp2.waitForRest() == 0)
                doPhaseThreeSetup();
                
            bp2b.waitForRest();
            doPhaseThree(is[i]);
            bpEnd.waitForRest();
            } catch (InterruptedException ex) {};
    }
}