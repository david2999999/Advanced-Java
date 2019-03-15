import java.applet.*;
import java.awt.*;

public class Animate extends Applet implements Runnable {
    int count, lastcount;
    Image pictures[];
    Thread timer;
    
    public void init() {
        lastcount = 10; count = 0;
        pictures = new Image[10];
        MediaTracker tracker = new MediaTracker(this);
        
        for (int a = 0; a < lastcount; a++) {
            pictures[a] = getImage (
            getCodeBase(), new Integer(a).toString()+".jpeg");
            tracker.addImage(pictures[a], 0);
        }
        tracker.checkAll(true);
    }
    
    public void start() {
        if (timer == null) {
            timer = new Thread(this);
            timer.start();
        }
    }
    
    public void paint(Graphics g) {
        g.drawImage(pictures[count++], 0, 0, null);
        if (count == lastcount) count = 0;
    }
    
    public void run() {
        while (isActive()) {
            try {
                repaint();
                Thread.sleep(1000);
            } catch (Exception e) {}
        }
        timer = null;
    }
}