public class TryWithResources {
    // try-with-resources - the the best way to close resources!
    static String firstLineOfFile(String path) throws IOException {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        }
    }

    // try-with-resources on multiple resources - short and sweet
    static void copy(String src, String dst) throws IOException {
        try (InputStream in = new FileInputStream(src);
             OutputStream out = new FileOutputStream(dst)) {
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0)
                out.write(buf, 0, n);
        }
    }

    // try-with-resources with a catch clause
    static String firstLineOfFile(String path, String defaultVal) {
        try (BufferedReader br = new BufferedReader(
                new FileReader(path))) {
            return br.readLine();
        } catch (IOException e) {
            return defaultVal;
        }
    }
}

//Not only are the try-with-resources versions shorter and more readable than the
//originals, but they provide far better diagnostics. Consider the
//firstLineOfFile method. If exceptions are thrown by both the readLine
//call and the (invisible) close, the latter exception is suppressed in favor of the
//former. In fact, multiple exceptions may be suppressed in order to preserve the
//exception that you actually want to see. These suppressed exceptions are not
//merely discarded; they are printed in the stack trace with a notation saying that
//they were suppressed.