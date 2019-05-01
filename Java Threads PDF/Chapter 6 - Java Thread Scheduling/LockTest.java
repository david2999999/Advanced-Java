public class LockTest {
    Object someObject = new Object();
    
    class ThreadA extends Thread {
        ThreadA() {
            setPriority(Thread.MAX_PRIORITY);
        }
        
        public void run() {
            synchronized(someObject) {
                someObject.wait();
            }
            someObject.methodA();
        }
    }
    
    class ThreadB extends Thread {
        ThreadB() {
            setPriority(Thread.NORM_PRIORITY);
        }
        
        public void run() {
            synchronized(someObject) {
                someObject.notify();
            }
                someObject.methodB();
        }
    }
    
    static void main(String args[]) {
        new ThreadA().start();
        new ThreadB().start();
    }
}