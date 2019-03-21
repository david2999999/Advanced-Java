public class BusyFlag {
    protected Thread busyflag = null;
    
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
            return true;
        }
        return false;
    }
    public synchronized void freeBusyFlag() {
        if (busyflag == Thread.currentThread()) {
            busyflag = null;
        }
    }
    
    public void getBusyFlag () {
        while (true) {
            synchronized (this) {
                if (busyflag == null) {
                    busyflag = Thread.currentThread();
                    break;
                }
            }
            
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }
}