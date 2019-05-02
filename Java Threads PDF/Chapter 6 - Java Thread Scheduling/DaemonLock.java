public class DaemonLock implements Runnable {
    private int lockCount = 0;
    
    public synchronized void acquire() {
        if (lockCount++ == 0) {
            Thread t = new Thread(this);
            t.setDaemon(false);
            t.start();
        }
    }
    
    public synchronized void release() {
        if (--lockCount == 0) {
            notify();
        }
    }
    
    public synchronized void run() {
        while (lockCount != 0) {
            try {
                wait();
            } catch (InterruptedException ex) {};
        }
    }
}