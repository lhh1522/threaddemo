package thread.demo;

public class ThreadTest {
    public static void main(String[] args) {
        TicketWindow window1 = new TicketWindow("一号出号机");
        window1.start();

        TicketWindow window2 = new TicketWindow("二号出号机");
        window2.start();

        TicketWindow window3 = new TicketWindow("三号出号机");
        window3.start();

        TicketWindow window4 = new TicketWindow("四号出号机");
        window4.start();
    }
}
