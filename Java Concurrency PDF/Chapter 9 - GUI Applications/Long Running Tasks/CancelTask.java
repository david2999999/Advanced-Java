public class CancelTask {
    Future<?> runningTask = null; // thread-confined

    startButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            if (runningTask != null) {
                runningTask = backgroundExec.submit(new Runnable() {
                    public void run() {
                        while (moreWork()) {
                            if (Thread.currentThread().isInterrupted()) {
                                cleanUpPartialWork();
                                break;
                            }
                            doSomeWork();
                        }
                    }
                });
            };
        }
    });
    
    cancelButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent event) {
            if (runningTask != null)
                runningTask.cancel(true);
        }
    });
}