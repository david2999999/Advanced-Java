public class CPUScheduler extends Thread {
    private int timeslice; // # of milliseconds thread should run
    private CircularList threads; // All the threads we're scheduling
    public volatile boolean shouldRun = false; // Exit when this is set
    private Thread current;
    private static boolean initialized = false;
    
    private synchronized static boolean isInitialized() {
        if (initialized)
            return true;
        initialized = true;
        return false;
    }
    
    public CPUScheduler(int t) {
        if (isInitialized())
            throw new SecurityException("Already initialized");
        threads = new CircularList();
        timeslice = t;
    }

    public CPUScheduler(int t) {
        threads = new CircularList();
        timeslice = t;
    }
    
    public void addThread(Thread t) {
        threads.insert(t);
        t.setPriority(2);
    }
    
    public void removeThread(Thread t) {
        try {
            t.setPriority(5);
        } catch(Exception e) {}
        
        threads.delete(t);
        synchronized(this) {
            if (current == t)
                current = null;
        }
    }
    
    public void run() {
        Thread current;
        setPriority(6);
        
        while (shouldRun) {
            current = (Thread) threads.getNext();
            if (current == null)
                return;
                
            try {
                current.setPriority(4);
            } catch (Exception e) {
                removeThread(current);
            }
            
            try {
                Thread.sleep(timeslice);
            } catch (InterruptedException ie) {};
            
            synchronized(this) {
                if (current != null)
                    try {
                        current.setPriority(2);
                    } catch (Exception e) {
                        removeThread(current);
                    }
        }
    }
}