package thread.demo;

public class TicketWindow extends Thread {
    private String name;
    private static final int Max = 50;
    private static int index = 1;
    private int count = 1;

    public TicketWindow(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (count < Max) {
            System.out.println("柜台：" + name + "当前的号码是：" + (index ++));
            count ++;
        }
    }

}
