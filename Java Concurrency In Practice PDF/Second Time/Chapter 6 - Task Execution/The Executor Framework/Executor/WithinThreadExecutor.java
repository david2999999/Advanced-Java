public class WithinThreadExecutor implements Executor {
    public void execute(Runnable r) {
        r.run();
    };
}