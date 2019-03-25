public class ProcessIt implements Runnable {
    String is[];
    Barrier bpStart, bp1, bp2, bpEnd;
    
    public ProcessIt (String sources[]) {
        is = sources;
        bpStart = new Barrier(sources.length);
        bp1 = new Barrier(sources.length);
        bp2 = new Barrier(sources.length);
        bpEnd = new Barrier(sources.length);
        
        for (int i=0; i < is.length; i++) {
            (new Thread(this)).start();
        }
    }
    public void run() {
        try {
            int i = bpStart.waitForRest();
            doPhaseOne(is[i]);
            bp1.waitForRest();
            doPhaseTwo(is[i]);
            bp2.waitForRest();
            doPhaseThree(is[i]);
            bpEnd.waitForRest();
        } catch (InterruptedException ex) {};
    }
    
    public void doPhaseOne(String ps) {
    }
    
    public void doPhaseTwo(String ps) {
    }
    
    public void doPhaseThree(String ps) {
    }
    
    static public void main(String args[]) {
        ProcessIt pi = new ProcessIt(args);
    }
}