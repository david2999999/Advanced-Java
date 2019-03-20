import java.io.*;
import java.net.*;

public class AsyncReadSocket extends Thread {
    private Socket s;
    private StringBuffer result;
    
    public AsyncReadSocket(Socket s) {
        this.s = s;
        result = new StringBuffer();
    }
    
    public void run() {
        DataInputStream is = null;
        try {
            is = new DataInputStream(s.getInputStream());
        } catch (Exception e) {}
        
        while (true) {
            try {
                char c = is.readChar();
                appendResult(c);
            } catch (Exception e) {}
        }
    }
    // Get the string already read from the socket so far.
    // This method is used by the Applet thread to obtain the data
    // in a synchronous manner.
    public synchronized String getResult() {
        String retval = result.toString();
        result = new StringBuffer();
        return retval;
    }
    // Put new data into the buffer to be returned
    // by the getResult method.
    public synchronized void appendResult(char c) {
        result.append(c);
    }
}