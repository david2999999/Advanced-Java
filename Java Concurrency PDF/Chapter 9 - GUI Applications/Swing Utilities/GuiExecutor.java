public class GuiExecutor extends AbstractExecutorService {
    // Singletons have a private constructor and a public factory
    private static final GuiExecutor instance = new GuiExecutor();
    private GuiExecutor() { }
    
    public static GuiExecutor instance() { return instance; }
    
    public void execute(Runnable r) {
        if (SwingUtilities.isEventDispatchThread())
            r.run();
        else
            SwingUtilities.invokeLater(r);
    }
    // Plus trivial implementations of lifecycle methods
}