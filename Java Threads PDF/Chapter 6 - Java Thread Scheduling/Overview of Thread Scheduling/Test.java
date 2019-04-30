public class Test {
    public static void main(String args[]) {
        TestThread t1, t2, t3;
        t1 = new TestThread("Thread 1");
        t1.start();
        t2 = new TestThread("Thread 2");
        t2.start();
        t3 = new TestThread("Thread 3");
        t3.start();
    }
}