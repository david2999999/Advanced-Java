import java.io.*;
import java.net.*;

public class TCPCalcServer extends TCPServer {
    class CalcObject implements Runnable {
        OutputStream os;
        InputStream is;
        
        CalcObject(InputStream is, OutputStream os) {
            this.os = os;
            this.is = is;
        }
        public void run() {
            // Perform calculation.
        }
    }
    
    ThreadPool pool;
    
    TCPCalcServer() {
        int numThreads = CPUSupport.getNumProcessors();
        CPUSupport.setConcurrency(numThreads + 5);
        pool = new ThreadPool(numThreads);
    }
    
    public static void main(String args[]) {
        try {
            new TCPCalcServer().startServer(3535);
        } catch (IOException ioe) {
            // Error processing omitted.
        }
    }
    
    public void run(Socket data) {
        try {
            pool.addRequest(new CalcObject(data.getInputStream(), data.getOutputStream()));
        } catch (IOException ioe) {
            // Error processing omitted.
        }
    }
}