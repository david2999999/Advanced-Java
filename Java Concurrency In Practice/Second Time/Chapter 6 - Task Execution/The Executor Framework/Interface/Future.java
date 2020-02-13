public interface Future<V> {
    boolean cancel(boolean mayInterruptIfRunning);
    boolean isCancelled();
    boolean isDone();

    V get() throws InterruptedException, ExecutionException,
            CancellationException;

    V get(long timeout, TimeUnit unit)
            throws InterruptedException, ExecutionException,
            CancellationException, TimeoutException;
}