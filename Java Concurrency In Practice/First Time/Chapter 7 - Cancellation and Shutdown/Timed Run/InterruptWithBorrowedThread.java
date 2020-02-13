public class InterruptWithBorrowedThread {
    private static final ScheduledExecutorService cancelExec = ...;
    
    public static void timedRun(Runnable r, long timeout, TimeUnit unit) {
        final Thread taskThread = Thread.currentThread();
        cancelExec.schedule(new Runnable() {
            public void run() { taskThread.interrupt(); }
        }, timeout, unit);
        r.run();
    }
}