public class AutomatedTellerMachine extends Teller {
    Account a;
    
    public boolean synchronized login(String name, String password) {
        if (a != null)
            throw new IllegalArgumentException("Already logged in");
            
        a = verifyAccount(name, password);
        if (a == null)
            return false;
            
        a.lock();
        return true;
    }
    
    public void withdraw(float amount) {
        if (a.deduct(amount))
            dispense(amount);
        printReceipt();
    }
    public void balanceInquiry() {
        printBalance(a.balance());
    }
    public void synchronized logoff() {
        a.unlock();
        a = null;
    }
}