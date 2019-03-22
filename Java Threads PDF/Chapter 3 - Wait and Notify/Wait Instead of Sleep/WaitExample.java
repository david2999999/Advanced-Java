public class WaitExample {
    public synchronized void ProcessLoop() {
        processOne();
        
        try {
            wait(1000);
        } catch (Exception e) {}
        
        processTwo();
    }
}

public class WaitExample {
    public void ProcessLoop() {
        synchronized (this) {
            processOne();
        }
        
        try {
            Thread.sleep(1000);
        } catch (Exception e) {}
        
        synchronized (this) {
            processTwo();
        }
    }
}