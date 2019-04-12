public class ShutDownHookForLogging {
    public void start() {
        Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                try { LogService.this.stop(); }
                catch (InterruptedException ignored) {}
            }
        });
    }
}