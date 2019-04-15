public interface ThreadFactory {
    Thread newThread(Runnable r);
}