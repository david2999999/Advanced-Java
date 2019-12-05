public class LogWriter {
    private final BlockingQueue<String> queue;
    private final LoggerThread logger;
    
    public LogWriter(Writer writer) {
        this.queue = new LinkedBlockingQueue<String>(CAPACITY);
        this.logger = new LoggerThread(writer);
    }
    
    public void start() { logger.start(); }
    
    public void log(String msg) throws InterruptedException {
        queue.put(msg);
    }
    
    public void log(String msg) throws InterruptedException {
        if (!shutdownRequested)
            queue.put(msg);
        else
            throw new IllegalStateException("logger is shut down");
    }
    
    private class LoggerThread extends Thread {
        private final PrintWriter writer;

        public void run() {
            try {
                while (true)
                    writer.println(queue.take());
            } catch(InterruptedException ignored) {
            } finally {
                writer.close();
            }
        }
    }
}