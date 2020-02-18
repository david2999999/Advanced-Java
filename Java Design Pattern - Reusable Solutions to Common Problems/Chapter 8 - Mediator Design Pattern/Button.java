public class Button implements Colleague {
    private MachineMediator mediator;

    @Override
    public void setMediator(MachineMediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        System.out.println("Button pressed.");
        mediator.start();
    }
}

// The above Button class is a colleague class which holds a reference to a mediator. The user press the button which calls the
//press() method of this class which in turn, calls the start() method of the concrete mediator class. This start() method
//of the mediator calls the start() method of machine class on behalf of the Button class.