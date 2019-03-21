class Account {
    private float total;
    private BusyFlag flag = new BusyFlag();
    
    public synchronized boolean deduct(float t) {
        if (t <= total) {
            total -= t;
            return true;
        }
        else return false;
    }
    
    public synchronized float balance() {
        return total;
    }
    
    public void lock() {
        flag.getBusyFlag();
    }
    
    public void unlock() {
        flag.freeBusyFlag();
    }
}