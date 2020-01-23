public class GUI {
    public static void main(String[] args) {
        ExecutorService backgroundExec = Executors.newCachedThreadPool();

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                backgroundExec.execute(new Runnable() {
                    public void run() { doBigComputation(); }
                });
            }});
    }
}