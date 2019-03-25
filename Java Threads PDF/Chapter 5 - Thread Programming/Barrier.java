public class Barrier {
    private int threads2Wait4;
    private InterruptedException iex;
    
    public Barrier (int nThreads) {
        threads2Wait4 = nThreads;
    }
    
    public synchronized int waitForRest()
        throws InterruptedException {
        int threadNum = --threads2Wait4;
        if (iex != null) throw iex;
        
        if (threads2Wait4 <= 0) {
            notifyAll();
            return threadNum;
        }
        while (threads2Wait4 > 0) {
            if (iex != null) throw iex;
            try {
                wait();
            } catch (InterruptedException ex) {
                iex = ex;
                notifyAll();
            }
        }
        return threadNum;
    }
    
    public synchronized void freeAll() {
        iex = new InterruptedException("Barrier Released by freeAll");
        notifyAll();
    }
}