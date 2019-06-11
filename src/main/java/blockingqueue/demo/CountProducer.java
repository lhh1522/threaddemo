package blockingqueue.demo;

import java.util.concurrent.BlockingQueue;

public class CountProducer {
    private BlockingQueue<Integer> blockingQueue;

    public CountProducer(BlockingQueue<Integer> blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    public void put(int i) {
        try {
            blockingQueue.put(i);
            System.out.println("第" + i + "个客户等待被处理");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
