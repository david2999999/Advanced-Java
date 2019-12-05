public class ParallelExecution {
    void processSequentially(List<Element> elements) {
        for (Element e : elements)
            process(e);
    }
    
    void processInParallel(Executor exec, List<Element> elements) {
        for (final Element e : elements)
            exec.execute(new Runnable() {
                public void run() { process(e); }
        });
    }
}