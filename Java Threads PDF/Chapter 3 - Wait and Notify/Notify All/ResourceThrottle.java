public class ResourceThrottle {
    private int resourcecount = 0;
    private int resourcemax = 1;
    
    public ResourceThrottle (int max) {
        resourcecount = 0;
        resourcemax = max;
    }
    
    public synchronized void getResource (int numberof) {
        while (true) {
            if ((resourcecount + numberof) <= resourcemax) {
                resourcecount += numberof;
            break;
            }
            
            try {
                wait();
            } catch (Exception e) {}
        }
    }
    
    public synchronized void freeResource (int numberof) {
        resourcecount -= numberof;
        notifyAll();
    }
}