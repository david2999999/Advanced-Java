public class MyThread extends Thread {
    public void run() {
        while (true) {
            synchronized(someObject) {
            // ... Do some calculations ...
            }
        }
    }
}