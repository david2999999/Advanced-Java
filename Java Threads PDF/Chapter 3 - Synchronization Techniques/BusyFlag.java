public class BusyFlag {
    protected Thread busyflag = null;
    
    public void getBusyFlag () {
        while (busyflag != Thread.currentThread()) {
            if (busyflag == null)
                busyflag = Thread.currentThread();
                
            try {
                Thread.sleep(100);
            } catch (Exception e) {}
        }
    }
    
    public void freeBusyFlag () {
        if (busyflag == Thread.currentThread()) {
            busyflag = null;
        }
    }
}