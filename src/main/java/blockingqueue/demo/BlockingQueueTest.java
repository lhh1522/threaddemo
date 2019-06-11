package blockingqueue.demo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {
    public static void main(String[] args) {
        BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<Integer>(10);
        CountProducer producer = new CountProducer(blockingQueue);
        new Thread(new CountConcumer(blockingQueue, "first")).start();
        new Thread(new CountConcumer(blockingQueue, "second")).start();
        new Thread(new CountConcumer(blockingQueue, "third")).start();
        new Thread(new CountConcumer(blockingQueue, "fourth")).start();

        for (int i = 0; i < 100; i ++) {
            if (i == 100) {
                producer.put(-1);
            } else {
                producer.put(i);
            }
        }
    }
}
