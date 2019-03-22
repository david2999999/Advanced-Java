public class TargetNotify {
    private Object Targets[] = null;
    
    public TargetNotify (int numberOfTargets) {
        Targets = new Object[numberOfTargets];
        
        for (int i = 0; i < numberOfTargets; i++) {
            Targets[i] = new Object();
        }
    }
    public void wait (int targetNumber) {
        synchronized (Targets[targetNumber]) {
            try {
                Targets[targetNumber].wait();
            } catch (Exception e) {}
        }
    }
    public void notify (int targetNumber) {
        synchronized (Targets[targetNumber]) {
            Targets[targetNumber].notify();
        }
    }
}