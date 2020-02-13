public class GUI {
    public static void main(String[] args) {
        ExecutorService backgroundExec = Executors.newCachedThreadPool();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backgroundExec.execute(new Runnable() {
                    public void run() { doBigComputation(); }
                });
            }});

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                button.setEnabled(false);
                label.setText("busy");
                backgroundExec.execute(new Runnable() {
                    public void run() {
                        try {
                            doBigComputation();
                        } finally {
                            GuiExecutor.instance().execute(new Runnable() {
                                public void run() {
                                    button.setEnabled(true);
                                    label.setText("idle");
                                }
                            });
                        }
                    }
                });
            }
        });

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
            }});

        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                if (runningTask != null)
                    runningTask.cancel(true);
            }});
    }
}