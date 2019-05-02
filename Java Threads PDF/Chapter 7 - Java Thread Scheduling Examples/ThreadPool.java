public class ThreadPool {
    
    class ThreadPoolRequest {
        Runnable target;
        Object lock;
        
        ThreadPoolRequest(Runnable t, Object l) {
            target = t;
            lock = l;
        }
    }
    
}