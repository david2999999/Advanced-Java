public class TestRead extends Thread {
    AsyncReadSocket asr;
    
    public static void main(String args[]) {
        AsyncReadSocket asr = new AsyncReadSocket("myhost", 6001);
        asr.start();
        new TestRead(asr).start();
    }
    
    public TestRead(AsyncReadSocket asr) {
        super("ReaderThread");
        this.asr = asr;
    }
    
    public void run() {
        // Do some other processing, and allow asr to read data.
        System.out.println("Data is " + asr.getResult());
    }
}