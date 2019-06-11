package blockingqueue.demo;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

public class CountConcumer implements Runnable {
    private BlockingQueue<Integer> blockingQueue;
    private String name;

    public CountConcumer(BlockingQueue<Integer> blockingQueue, String name) {
        this.blockingQueue = blockingQueue;
        this.name = name;
    }

    public void run() {
        try {
            while (true) {
                Integer i = blockingQueue.poll(1, TimeUnit.SECONDS);
                if (i != null && i >= 0) {
                    System.out.println(this.name + "处理第" + i + "个客户");
                    Thread.sleep(10);
                } else {
                    break;
                }
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
