public class AutomatedTellerMachine extends Teller {
    public void withdraw(float amount) {
        Account a = getAccount();
        
        if (a.deduct(amount))
            dispense(amount);
        printReceipt();
    }
}