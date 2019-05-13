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
    
    public synchronized void lockWrite() {
        RWNode node;
        Thread me = Thread.currentThread();
        int index = getIndex(me);
        if (index == -1) {
            node = new RWNode(me, RWNode.WRITER);
            waiters.addElement(node);
        }
        else {
            node = (RWNode) waiters.elementAt(index);
            if (node.state == RWNode.READER)
                throw new IllegalArgumentException("Upgrade lock");
            node.state = RWNode.WRITER;
        }
        
        while (getIndex(me) != 0) {
            try {
                wait();
            } catch (Exception e) {}
        }
        node.nAcquires++;
    }
}