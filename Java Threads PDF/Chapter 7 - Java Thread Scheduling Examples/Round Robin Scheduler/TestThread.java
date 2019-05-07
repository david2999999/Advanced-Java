class TestThread extends Thread {
    String id;
    
    public TestThread(String s) {
        id = s;
    }
    
    public void doCalc(int i) {}
    
    public void run() {
        int i;
        for (i = 0; i < 10; i++) {
            doCalc(i);
            System.out.println(id);
        }
    }
}