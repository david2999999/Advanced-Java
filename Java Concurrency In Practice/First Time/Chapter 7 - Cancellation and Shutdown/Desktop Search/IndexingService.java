public class IndexingService {
    private static final File POISON = new File("");
    private final IndexerThread consumer = new IndexerThread();
    private final CrawlerThread producer = new CrawlerThread();
    private final BlockingQueue<File> queue;
    private final FileFilter fileFilter;
    private final File root;
    
    class CrawlerThread extends Thread { 
        public void run() {
            try {
                crawl(root);
            } catch (InterruptedException e) { /* fall through */ }
            finally {
                while (true) {
                    try {
                        queue.put(POISON);
                        break;
                    } catch (InterruptedException e1) { /* retry */ }
                }
            }
        }
        private void crawl(File root) throws InterruptedException {

        }
    }
    
    class IndexerThread extends Thread { 
        public void run() {
            try {
                while (true) {
                    File file = queue.take();
                    if (file == POISON)
                        break;
                    else
                        indexFile(file);
                }
            } catch (InterruptedException consumed) { }
        }
    }
    
    public void start() {
        producer.start();
        consumer.start();
    }
    
    public void stop() { producer.interrupt(); }
    
    public void awaitTermination() throws InterruptedException {
        consumer.join();
    }
}