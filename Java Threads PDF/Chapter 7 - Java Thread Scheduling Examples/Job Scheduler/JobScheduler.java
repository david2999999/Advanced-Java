import java.util.*;
public class JobScheduler implements Runnable {
    final public static int ONCE = 1;
    final public static int FOREVER = -1;
    final public static long HOURLY = (long)60*60*1000;
    final public static long DAILY = 24*HOURLY;
    final public static long WEEKLY = 7*DAILY;
    final public static long MONTHLY = -1;
    final public static long YEARLY = -2;
    
    private class JobNode {
        public Runnable job;
        public Date executeAt;
        public long interval;
        public int count;
    }
    
    private ThreadPool tp;
    private DaemonLock dlock = new DaemonLock();
    private Vector jobs = new Vector(100);
    
    public JobScheduler(int poolSize) {
        tp = (poolSize > 0) ? new ThreadPool(poolSize) : null;
        Thread js = new Thread(this);
        js.setDaemon(true);
        js.start();
    }
    
    private synchronized void addJob(JobNode job) {
        dlock.acquire();
        jobs.addElement(job);
        notify();
    }
    
    private synchronized void deleteJob(Runnable job) {
        for (int i=0; i < jobs.size(); i++) {
            if (((JobNode) jobs.elementAt(i)).job == job) {
                jobs.removeElementAt(i);
                dlock.release();
                break;
            }
        }
    }
    
    private JobNode updateJobNode(JobNode jn) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(jn.executeAt);
        if (jn.interval == MONTHLY) {
            // There is a minor bug (see java.util.calendar).
            cal.add(Calendar.MONTH, 1);
            jn.executeAt = cal.getTime();
        } else if (jn.interval == YEARLY) {
            cal.add(Calendar.YEAR, 1);
            jn.executeAt = cal.getTime();
        } else {
            jn.executeAt = new Date(jn.executeAt.getTime() + jn.interval);
        }
        
        jn.count = (jn.count == FOREVER) ? FOREVER : jn.count - 1;
        return (jn.count != 0) ? jn : null;
    }
    
    private synchronized long runJobs() {
        long minDiff = Long.MAX_VALUE;
        long now = System.currentTimeMillis();
        
        for (int i=0; i < jobs.size();) {
            JobNode jn = (JobNode) jobs.elementAt(i);
            if (jn.executeAt.getTime() <= now) {
                if (tp != null) {
                    tp.addRequest(jn.job);
                } else {
                    Thread jt = new Thread(jn.job);
                    jt.setDaemon(false);
                    jt.start();
                }
                
                if (updateJobNode(jn) == null) {
                    jobs.removeElementAt(i);
                    dlock.release();
                }
            } else {
                long diff = jn.executeAt.getTime() - now;
                minDiff = Math.min(diff, minDiff);
                i++;
            }
        }
        return minDiff;
    }
    
    public synchronized void run() {
        while (true) {
            long waitTime = runJobs();
            try {
                wait(waitTime);
            } catch (Exception e) {};
        }
    }
    
    public void execute(Runnable job) {
        executeIn(job, (long)0);
    }
    
    public void executeIn(Runnable job, long millis) {
        executeInAndRepeat(job, millis, 1000, ONCE);
    }
    
    public void executeInAndRepeat(Runnable job, long millis, long repeat) {
        executeInAndRepeat(job, millis, repeat, FOREVER);
    }
    
    public void executeInAndRepeat(Runnable job, long millis, long repeat, int count) {
        Date when = new Date(System.currentTimeMillis() + millis);
        executeAtAndRepeat(job, when, repeat, count);
    }
    
    public void executeAt(Runnable job, Date when) {
        executeAtAndRepeat(job, when, 1000, ONCE);
    }
    
    public void executeAtAndRepeat(Runnable job, Date when, long repeat) {
        executeAtAndRepeat(job, when, repeat, FOREVER);
    }
    
    public void executeAtAndRepeat(Runnable job, Date when, long repeat, int count) {
        JobNode jn = new JobNode();
        jn.job = job;
        jn.executeAt = when;
        jn.interval = repeat;
        jn.count = count;
        addJob(jn);
    }
    
    public void cancel(Runnable job) {
        deleteJob(job);
    }
}