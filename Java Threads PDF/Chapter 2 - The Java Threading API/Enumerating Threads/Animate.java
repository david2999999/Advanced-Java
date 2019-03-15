import java.applet.*;
import java.awt.*;

public class Animate extends Applet {
    // Instance variables and methods not shown
    public void printThreads() {
        Thread ta[] = new Thread[Thread.activeCount()];
        int n = Thread.enumerate(ta);
        for (int i = 0; i < n; i++) {
            System.out.println("Thread " + i + " is " +
            ta[i].getName());
        }
    }
}