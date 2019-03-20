public class Account {
    private float total;
    private flag = new BusyFlag();
    
    public boolean deduct(float t) {
        boolean succeed = false;
        flag.getBusyFlag();
        
        if (t <= total) {
            total -= t;
            succeed = true;
        }
        
        flag.freeBusyFlag();
        return succeed;
    }
}