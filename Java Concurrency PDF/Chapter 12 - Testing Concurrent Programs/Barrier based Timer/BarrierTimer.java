this.timer = new BarrierTimer();
this.barrier = new CyclicBarrier(npairs * 2 + 1, timer);

public class BarrierTimer implements Runnable {
    private boolean started;
    private long startTime, endTime;
    
    public synchronized void run() {
        long t = System.nanoTime();
        if (!started) {
            started = true;
            startTime = t;
        } else
            endTime = t;
    }
    
    public synchronized void clear() {
        started = false;
    }
    
    public synchronized long getTime() {
        return endTime - startTime;
    }
}