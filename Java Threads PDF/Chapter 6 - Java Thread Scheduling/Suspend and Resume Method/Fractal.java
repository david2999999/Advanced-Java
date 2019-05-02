import java.applet.Applet;
import java.awt.*;
public class Fractal extends Applet implements Runnable {
    Thread t;
    public void start() {
        if (t == null) {
            t = new Thread(this);
            t.setPriority(Thread.currentThread().getPriority() - 1);
            t.start();
        }
        else t.resume();
    }
    
    public void stop() {
        t.suspend();
    }
    
    public void run() {
        // Do calculations, occasionally calling repaint().
    }
    
    public void paint(Graphics g) {
        // Paint the completed sections of the fractal.
    }
}