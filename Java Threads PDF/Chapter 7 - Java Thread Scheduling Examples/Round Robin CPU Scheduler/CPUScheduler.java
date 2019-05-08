public class CPUScheduler extends Thread {
    private int timeslice; // # of milliseconds thread should run
    private CircularList threads; // All the threads we're scheduling
    public volatile boolean shouldRun = false; // Exit when this is set
    
    public CPUScheduler(int t) {
        threads = new CircularList();
        timeslice = t;
    }
    
    public void addThread(Thread t) {
        threads.insert(t);
        t.setPriority(2);
    }
    
    public void removeThread(Thread t) {
        t.setPriority(5);
        threads.delete(t);
    }
    
    public void run() {
        Thread current;
        setPriority(6);
        
        while (shouldRun) {
            current = (Thread) threads.getNext();
            if (current == null)
                return;
                
            current.setPriority(4);
            
            try {
                Thread.sleep(timeslice);
            } catch (InterruptedException ie) {};
            
            current.setPriority(2);
        }
    }
}