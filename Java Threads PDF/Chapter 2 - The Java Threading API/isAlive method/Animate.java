import java.applet.*;
import java.awt.*;

public class Animate extends Applet {
    int count, lastcount;
    Image pictures[];
    TimerThread timer;
    
    public void init() {
        lastcount = 10; count = 0;
        pictures = new Image[10];
        MediaTracker tracker = new MediaTracker(this);
        
        for (int a = 0; a < lastcount; a++) {
            pictures[a] = getImage(getCodeBase(), new Integer(a).toString()+".jpeg");
            tracker.addImage(pictures[a], 0);
        }
        tracker.checkAll(true);
    }
    
    public void start() {
        timer = new TimerThread(this, 1000);
        timer.start();
    }
    
    public void stop() {
        timer.shouldRun = false;
        while (timer.isAlive()) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {}
        }
        timer = null;
    }
    
    public void paint(Graphics g) {
        g.drawImage(pictures[count++], 0, 0, null);
        if (count == lastcount) count = 0;
    }
}