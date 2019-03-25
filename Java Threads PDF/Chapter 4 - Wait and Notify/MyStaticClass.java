public class MyStaticClass {
    static private Object obj = new Object();
    
    public static void staticWait() {
        synchronized (obj) {
            try {
                obj.wait();
            } catch (Exception e) {}
        }
    }
    public static void staticNotify() {
        synchronized (obj) {
            obj.notify();
        }
    }
}