public class CallerRun {
    ThreadPoolExecutor executor = new ThreadPoolExecutor(N_THREADS, N_THREADS,
                                        0L, TimeUnit.MILLISECONDS,
                                        new LinkedBlockingQueue<Runnable>(CAPACITY));

    executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
}