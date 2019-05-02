public class YieldApplet extends Applet implements Runnable {
    Thread t;
    
    public void init() {
        t = new Thread(this);
    }
    
    public void paint(Graphics g) {
        t.yield();
    }
}