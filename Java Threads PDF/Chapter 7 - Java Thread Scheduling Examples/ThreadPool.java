public class ThreadPool {
    
    class ThreadPoolRequest {
        Runnable target;
        Object lock;
        
        ThreadPoolRequest(Runnable t, Object l) {
            target = t;
            lock = l;
        }
    }
    
    class ThreadPoolThread extends Thread {
        ThreadPool parent;
        volatile boolean shouldRun = true;
        
        ThreadPoolThread(ThreadPool parent, int i) {
            super("ThreadPoolThread " + i);
            this.parent = parent;
        }
        
        public void run() {
            ThreadPoolRequest obj = null;
            while (shouldRun) {
                try {
                    parent.cvFlag.getBusyFlag();
                    while (obj == null && shouldRun) {
                        try {
                            obj = (ThreadPoolRequest)
                            parent.objects.elementAt(0);
                            parent.objects.removeElementAt(0);
                        } catch (ArrayIndexOutOfBoundsException aiobe) {
                            obj = null;
                        } catch (ClassCastException cce) {
                            System.err.println("Unexpected data");
                            obj = null;
                        }
                        
                        if (obj == null) {
                            try {
                                parent.cvAvailable.cvWait();
                            } catch (InterruptedException ie) {
                                return;
                            }
                        }
                    }
                } finally {
                    parent.cvFlag.freeBusyFlag();
                }
                
                if (!shouldRun)
                    return;
                    
                obj.target.run();
                try {
                    parent.cvFlag.getBusyFlag();
                    nObjects--;
                    
                    if (nObjects == 0)
                        parent.cvEmpty.cvSignal();
                } finally {
                    parent.cvFlag.freeBusyFlag();
                }
                
                if (obj.lock != null) {
                    synchronized(obj.lock) {
                        obj.lock.notify();
                    }
                }
                obj = null;
            }
        }
    }
}