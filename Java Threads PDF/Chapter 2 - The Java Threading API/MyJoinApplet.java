import java.applet.Applet;

public class MyJoinApplet extends Applet {
    Thread t[] = new Thread[30];
    
    public void start() {
        for (int i=0; i<30; i++) {
            t[i] = new CalcThread(i);
            t[i].start();
        }
    }
    public void stop() {
        for (int i=0; i<30; i++) {
            try {
                t[i].join();
            } catch (InterruptedException e) {}
        }
    }
}