public class Cleaneable {
    // An autocloseable class using a cleaner as a safety net
    public class Room implements AutoCloseable {
        private static final Cleaner cleaner = Cleaner.create();

        // Resource that requires cleaning. Must not refer to Room!
        private static class State implements Runnable {
            int numJunkPiles; // Number of junk piles in this room

            State(int numJunkPiles) {
                this.numJunkPiles = numJunkPiles;
            }

            // Invoked by close method or cleaner
            @Override
            public void run() {
                System.out.println("Cleaning room");
                numJunkPiles = 0;
            }
        }

        // The state of this room, shared with our cleanable
        private final State state;
        // Our cleanable. Cleans the room when it’s eligible for gc
        private final Cleaner.Cleanable cleanable;

        public Room(int numJunkPiles) {
            state = new State(numJunkPiles);
            cleanable = cleaner.register(this, state);
        }

        @Override
        public void close() {
            cleanable.clean();
        }
    }
}

// The static nested State class holds the resources that are required by the
//cleaner to clean the room. In this case, it is simply the numJunkPiles field,
//which represents the amount of mess in the room. More realistically, it might be
//a final long that contains a pointer to a native peer. State implements
//Runnable, and its run method is called at most once, by the Cleanable that
//we get when we register our State instance with our cleaner in the Room
//constructor. The call to the run method will be triggered by one of two things:
//Usually it is triggered by a call to Room’s close method calling Cleanable’s
//clean method. If the client fails to call the close method by the time a Room
//instance is eligible for garbage collection, the cleaner will (hopefully) call
//State’s run method.

public class Adult {
    public static void main(String[] args) {
        try (Room myRoom = new Room(7)) {
            System.out.println("Goodbye");
        }
    }
}

public class Teenager {
    public static void main(String[] args) {
        new Room(99);
        System.out.println("Peace out");
    }
}