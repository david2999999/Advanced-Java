import java.applet.*;
import java.awt.*;
public class Fractal extends Applet implements Runnable {
    Thread calcThread;
    boolean sectionsToCalculate;
    static int nSections = 10;
    
    public void start() {
        Thread current = Thread.currentThread();
        calcThread = new Thread(this);
        calcThread.setPriority(current.getPriority() - 1);
        calcThread.start();
    }
    
    public void stop() {
        sectionsToCalculate = false;
    }
    
    void doCalc(int i) {
        // Calculate section i of the fractal.
    }
    
    public void run() {
        for (int i = 0; i < nSections && sectionsToCalculate; i++) {
            doCalc(i);
            repaint();
        }
    }
    
    public void paint(Graphics g) {
        // Paint the calculated sections.
    }
}