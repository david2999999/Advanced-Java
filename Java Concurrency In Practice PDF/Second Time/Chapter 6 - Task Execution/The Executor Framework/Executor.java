public interface Executor {
    void execute(Runnable command);
}

// Executor is based on the producer-consumer pattern, where activities that submit
// tasks are the producers and the threads executer tasks are the consumers