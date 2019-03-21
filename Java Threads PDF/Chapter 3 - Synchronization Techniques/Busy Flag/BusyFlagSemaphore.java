public class BusyFlag {
    protected Thread busyflag = null;
    protected int busycount = 0;
    
    public void getBusyFlag() {
        while (tryGetBusyFlag() == false) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }
    
    public synchronized boolean tryGetBusyFlag() {
        if (busyflag == null) {
            busyflag = Thread.currentThread();
            busycount = 1;
            return true;
        }
        
        if (busyflag == Thread.currentThread()) {
            busycount++;
            return true;
        }
        return false;
    }
    
    public synchronized void freeBusyFlag () {
        if (getBusyFlagOwner() == Thread.currentThread()) {
            busycount—-;
         
            if (busycount == 0)
                busyflag = null;
        }
    }
    
    public synchronized Thread getBusyFlagOwner() {
        return busyflag;
    }
}