public class AsyncReadSocket extends Thread {
    StringBuffer result;
    
    public AsyncReadSocket(String host, int port) {
    // Open a socket to the given host.
    }
    
    public void run() {
    // Read data from a socket into the result string buffer.
    }
    // Get the string already read from the socket so far.
    // Only allows "Reader" threads to execute this method.
    public String getResult() {
        String reader = Thread.currentThread().getName();
        if (reader.startsWith("Reader")) {
            String retval = result.toString();
            result = new StringBuffer();
            return retval;
        } else {
            return "";
        }
    }
}