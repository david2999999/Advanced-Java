import java.awt.*;

public class TimerThread extends Thread {
    Component comp; // Component that needs repainting
    int timediff; // Time between repaints of the component
    volatile boolean shouldRun; // Set to false to stop thread
    
    public TimerThread(Component comp, int timediff) {
        super("TimerThread(" + timediff + " milliseconds)");
        this.comp = comp;
        this.timediff = timediff;
        shouldRun = true;
    }
    
    public void run() {
        while (shouldRun) {
            try {
                comp.repaint();
                sleep(timediff);
            } catch (Exception e) {}
        }
    }
}