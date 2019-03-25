public class StockHandler extends Thread {
    private BufferedReader br;
    private InputStream is;
    private Socket sock;
    private StockObservable stock;
    private volatile boolean done = false;
    private Object lock = new Object();
    
    class StockHandlerThread extends Thread {
        public void run() {
            String s;
            try {
                while ((s = br.readLine()) != null)
                    stock.setTick(s);
            } catch (IOException ioe) {}
            
            done = true;
            synchronized(lock) {
                lock.notify();
            }
        }
    }
    
    public StockHandler(StockObservable o, String host, int port)
        throws IOException, UnknownHostException {
            sock = new Socket(host, port);
            is = sock.getInputStream();
            stock = o;
        }
        
    public void run() {
        br = new BufferedReader(new InputStreamReader(is));
        Thread t = new StockHandlerThread();
        t.start();
        
        synchronized(lock) {
            while (!done) {
                try {
                    lock.wait(Integer.MAX_VALUE);
                } catch (InterruptedException ie) {
                    done = true;
                    try {
                        t.interrupt();
                        is.close();
                        sock.close();
                    } catch (IOException ioe) {}
                }
            }
        }
    }
}