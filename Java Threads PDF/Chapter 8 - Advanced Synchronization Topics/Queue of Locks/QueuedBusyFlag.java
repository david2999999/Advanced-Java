import java.util.Vector;

public class QueuedBusyFlag extends BusyFlag {
    protected Vector waiters;
    public QueuedBusyFlag() {
        waiters = new Vector();
    }
    public synchronized void getBusyFlag() {
        Thread me = Thread.currentThread();
        if (me == busyflag) {
            busycount++;
            return;
        }
        
        waiters.addElement(me);
        while ((Thread) waiters.elementAt(0) != me) {
            try {
                wait();
            } catch (Exception e) {}
        }
        busyflag = me;
        busycount = 0;
    }
    
    public synchronized void freeBusyflag() {
        if (Thread.currentThread() != busyflag)
            throw new IllegalArgumentException("QueuedBusyflag not held");
            
        if (busycount == 0) {
            waiters.removeElementAt(0);
            notifyAll();
            busyflag = null;
        }
        else busycount--;
    }
    public synchronized boolean tryGetBusyflag() {
        if (waiters.size() != 0 && busyflag != Thread.currentThread())
            return false;
        getBusyFlag();
        return true;
    }
}