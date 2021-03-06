## Java Threads API
The topic of threads is very important in Java - so important that many features of a threaded system
are built into the Java language itself, while other features of a threaded system are required by the
Java virtual machine. Threading is an integral part of using Java.

The concept of threads is not a new one: for some time, many operating systems have had libraries
that provide the C programmer with a mechanism to create threads. Other languages, such as Ada,
have support for threads embedded into the language, much as support for threads is built into the
Java language. Nonetheless, the topic of threads is usually considered a peripheral programming
topic, one that's only needed in special programming cases.

Java is a multi-threaded programming language which means we can develop multi-threaded program using Java. A multi-threaded program contains two or more parts that can run concurrently and each part can handle a different task at the same time making optimal use of the available resources specially when your computer has multiple CPUs.

By definition, multitasking is when multiple processes share common processing resources such as a CPU. Multi-threading extends the idea of multitasking into applications where you can subdivide specific operations within a single application into individual threads. Each of the threads can run in parallel. The OS divides processing time not only among different applications, but also among each thread within an application.

Multi-threading enables you to write in a way where multiple activities can proceed concurrently in the same program.

## wait
Object wait methods has three variance, one which waits indefinitely for any other thread to call notify or notifyAll method on the object to wake up the current thread. Other two variances puts the current thread in wait for specific amount of time before they wake up.

## notify
notify method wakes up only one thread waiting on the object and that thread starts execution. So if there are multiple threads waiting for an object, this method will wake up only one of them. The choice of the thread to wake depends on the OS implementation of thread management.

## notifyAll
notifyAll method wakes up all the threads waiting on the object, although which one will process first depends on the OS implementation.

These methods can be used to implement producer consumer problem where consumer threads are waiting for the objects in Queue and producer threads put object in queue and notify the waiting threads.

### Reentrant Locks
The ReentrantLock class implements the Lock interface and provides synchronization to methods while accessing shared resources. The code which manipulates the shared resource is surrounded by calls to lock and unlock method. This gives a lock to the current working thread and blocks all other threads which are trying to take a lock on the shared resource.



As the name says, ReentrantLock allow threads to enter into lock on a resource more than once. When the thread first enters into lock, a hold count is set to one. Before unlocking the thread can re-enter into lock again and every time hold count is incremented by one. For every unlock request, hold count is decremented by one and when hold count is 0, the resource is unlocked.

Reentrant Locks also offer a fairness parameter, by which the lock would abide by the order of the lock request i.e. after a thread unlocks the resource, the lock would go to the thread which has been waiting for the longest time. This fairness mode is set up by passing true to the constructor of the lock.

### Lock Striping
If you have to look for an example of lock striping in Java then it has to be a ConcurrentHashMap.

By default ConcurrentHashMap in Java has 16 buckets and each bucket has its own lock so there are 16 locks too. So the threads which are accessing keys in separate buckets can access them simultaneously.

If you have to visualize it then following image would give you an idea how lock striping for a ConcurrentHashMap will look like.

Here two threads want to access keys in bucket 0 so one of them can enter, again two threads want to access keys in bucket 1 so one of them can enter. Same with bucket n-3. So, with lock striping out of 6 3 threads can work on the data structure.

### Software Design Patterns
Design patterns are used to represent some of the best practices adapted by experienced object-oriented software developers. A design pattern systematically names, motivates, and explains a general design that addresses a recurring design problem in object-oriented systems. It describes the problem, the solution, when to apply the solution, and its consequences. It also gives implementation hints and examples.
