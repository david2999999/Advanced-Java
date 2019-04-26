public boolean trySendOnSharedLine(String message, long timeout, TimeUnit unit) throws InterruptedException {
    long nanosToLock = unit.toNanos(timeout) - estimatedNanosToSend(message);
    if (!lock.tryLock(nanosToLock, NANOSECONDS))
        return false;
        
    try {
        return sendOnSharedLine(message);
    } finally {
        lock.unlock();
    }
}