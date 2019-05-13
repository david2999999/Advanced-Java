public class RWLock {
    private Vector waiters;
    
    private int firstWriter() {
        Enumeration e;
        int index;
        for (index = 0, e = waiters.elements();
                        e.hasMoreElements(); index++) {
            RWNode node = (RWNode) e.nextElement();
            if (node.state == RWNode.WRITER)
                return index;
        }
        return Integer.MAX_VALUE;
    }
    
    private int getIndex(Thread t) {
        Enumeration e;
        int index;
        for (index = 0, e = waiters.elements(); e.hasMoreElements(); index++) {
            RWNode node = (RWNode) e.nextElement();
            
            if (node.t == t)
                return index;
        }
        return -1;
    }
    
    public RWLock() {
        waiters = new Vector();
    }
    public synchronized void lockRead() {
        RWNode node;
        Thread me = Thread.currentThread();
        int index = getIndex(me);
        if (index == -1) {
            node = new RWNode(me, RWNode.READER);
            waiters.addElement(node);
        }
        else node = (RWNode) waiters.elementAt(index);
        
        while (getIndex(me) > firstWriter()) {
            try {
                wait();
            } catch (Exception e) {}
        }
        node.nAcquires++;
    }
}