public synchronized void transferCredits(Account from, Account to, int amount) {
    from.setBalance(from.getBalance() - amount);
    
    if (random.nextInt(1000) > THRESHOLD)
        Thread.yield();
        
    to.setBalance(to.getBalance() + amount);
}