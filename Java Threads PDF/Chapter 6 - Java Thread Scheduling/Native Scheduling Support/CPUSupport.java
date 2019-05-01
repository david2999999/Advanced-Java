public class CPUSupport {
    static boolean loaded = false;
    
    static {
        try {
            System.loadLibrary("CPUSupportWin");
            loaded = true;
        } catch (Error e) {
            try {
                System.loadLibrary("CPUSupportSolaris");
                loaded = true;
            } catch (Error err) {
                System.err.println(
                "Warning: No platform library for CPUSupport");
            }
        }
    }
    
    private static native int getConcurrencyN();
    private static native void setConcurrencyN(int i);
    private static native int getNumProcessorsN();
    
    public static int getConcurrency() {
        if (!loaded)
            // Assume green threads.
            return 1;
        return getConcurrencyN();
    }
    public static void setConcurrency(int n) {
        if (loaded)
            setConcurrencyN(n);
    }
    
    public static int getNumProcessors() {
        if (!loaded)
            // Assume green threads.
            return 1;
        return getNumProcessorsN();
    }
}