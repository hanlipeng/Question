import com.test.list.SimpleBlockingQueue;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

/**
 * @author hanlipeng
 * @date 2020/7/24
 */
public class SimpleBlockingQueueTest {

    @Test
    public void testPush() throws InterruptedException {
        SimpleBlockingQueue<Integer> queue = new SimpleBlockingQueue<>(10);

        Thread thread = new Thread(() -> {
            try {
                for (int i = 0; i < 11; i++) {
                    queue.push(i);
                }
            } catch (InterruptedException ignored) {
                return;
            }
            Assert.fail();
        });
        thread.start();

        TimeUnit.SECONDS.sleep(1);

        thread.interrupt();
        String s = queue.toString();
        Assert.assertEquals(10, queue.size());
    }

    @Test
    public void testTake() throws InterruptedException {
        SimpleBlockingQueue<Integer> queue = new SimpleBlockingQueue<>(10);
        queue.push(1);
        queue.push(1);
        queue.push(1);
        Thread thread = new Thread(() -> {
            try {
                for (int i = 0; i < 11; i++) {
                    queue.poll();
                }
            } catch (InterruptedException ignored) {
                return;
            }
            Assert.fail();
        });
        thread.start();

        TimeUnit.SECONDS.sleep(1);

        thread.interrupt();
        Assert.assertEquals(0, queue.size());
    }

}
