public class TestFacade {
    public static void main(String[] args) {
        ScheduleServer scheduleServer = new ScheduleServer();
        ScheduleServerFacade facadeServer = new ScheduleServerFacade();
        facadeServer.startServer();
        
        System.out.println("Start working......");
        System.out.println("After work done.........");
        facadeServer.stopServer();
    }
}