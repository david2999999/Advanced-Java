public class AsyncInputStream extends FilterInputStream
implements Runnable {
private Thread runner; // Async reader thread
private volatile byte result[]; // Buffer
private volatile int reslen; // Buffer length
private volatile boolean EOF; // End-of-file indicator
private volatile IOException IOError; // I/O exceptions
BusyFlag lock; // Data lock
CondVar empty, full; // Signal variables
protected AsyncInputStream(InputStream in, int bufsize) {
super(in);
lock = new BusyFlag(); // Allocate sync variables.
empty = new CondVar(lock);
full = new CondVar(lock);
result = new byte[bufsize]; // Allocate storage area
reslen = 0; // and initialize variables.
EOF = false;
IOError = null;
runner = new Thread(this); // Start reader thread.
runner.start();
}
protected AsyncInputStream(InputStream in) {
this(in, 1024);
}
public int read() throws IOException {
try {
lock.getBusyFlag();
while (reslen == 0) {
try {
if (EOF) return(-1);
if (IOError != null) throw IOError;
empty.cvWait();
} catch (InterruptedException e) {}
}
return (int) getChar();
} finally {
lock.freeBusyFlag();
}
}
public int read(byte b[]) throws IOException {
return read(b, 0, b.length);
}
public int read(byte b[], int off, int len) throws IOException {
try {
lock.getBusyFlag();
while (reslen == 0) {
try {
if (EOF) return(-1);
if (IOError != null) throw IOError;
empty.cvWait();
} catch (InterruptedException e) {}
}
int sizeread = Math.min(reslen, len);
byte c[] = getChars(sizeread);
System.arraycopy(c, 0, b, off, sizeread);
return(sizeread);
} finally {
lock.freeBusyFlag();
}
}