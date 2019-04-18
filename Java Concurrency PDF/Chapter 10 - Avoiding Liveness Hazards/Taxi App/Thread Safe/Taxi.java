@ThreadSafe
class Taxi {
    @GuardedBy("this") private Point location, destination;
    private final Dispatcher dispatcher;

    public synchronized Point getLocation() {
        return location;
    }
    
    public synchronized void setLocation(Point location) {
        boolean reachedDestination;
        synchronized (this) {
            this.location = location;
            reachedDestination = location.equals(destination);
        }
        
        if (reachedDestination)
            dispatcher.notifyAvailable(this);
    }
}