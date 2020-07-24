import com.test.list.SimpleLinkedList;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author hanlipeng
 * @date 2020/7/24
 */
public class SimpleLinkedListTest {
    @Test
    public void testAdd() {
        SimpleLinkedList<Integer> simple = new SimpleLinkedList<>();

        for (int i = 0; i < 10; i++) {
            simple.add(i);
        }
        Assert.assertEquals("0,1,2,3,4,5,6,7,8,9", simple.toString());
        Assert.assertEquals(new Integer(5), simple.get(6));
        Assert.assertEquals(10, simple.size());
    }
}
