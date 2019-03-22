public class ExampleBlockLock {
    private StringBuffer sb = new StringBuffer();
    
    public void getLock() {
        doSomething(sb);
        
        synchronized (sb) {
            try {
                sb.wait();
            } catch (Exception e) {}
        }
    }
    
    public void freeLock() {
        doSomethingElse(sb);
        
        synchronized (sb) {
            sb.notify();
        }
    }
}