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
    }
}