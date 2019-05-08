class CalcRequest extends TCPServer {
    CPUScheduler scheduler;
    
    CalcRequest() {
        scheduler = new CPUScheduler(100);
        scheduler.start();
    }
    
    void doCalc(Socket s) {}
    
    public void run(Socket s) {
        scheduler.addThread(Thread.currentThread());
        doCalc(s);
    }
}