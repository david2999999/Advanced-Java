public class BTree {
    RWLock lock;
    public boolean find(Object o) {
        try {
            lock.lockRead();
            // Perform time-consuming search, returning the object
            // if found or null if the object is not found.
            return answer;
        } finally {
            lock.unlock();
        }
    }
    
    public void insert(Object o) {
        try {
            lock.lockWrite();
            // Perform a time-consuming insert.
        } finally {
            lock.unlock();
        }
    }
}