public class WorkerThread {
    public void run() {
        Throwable thrown = null;
        try {
            while (!isInterrupted())
                runTask(getTaskFromWorkQueue());
        } catch (Throwable e) {
            thrown = e;
        } finally {
            threadExited(this, thrown);
        }
    }
}