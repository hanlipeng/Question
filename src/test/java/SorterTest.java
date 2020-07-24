import com.test.list.Sorter;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author hanlipeng
 * @date 2020/7/24
 */
public class SorterTest {

    @Test
    public void test() {
        Sorter sorter = new Sorter();
        List<Integer> ints = IntStream.range(0, 1000)
                .boxed().collect(Collectors.toList());
        Collections.shuffle(ints);
        int[] shuffleArray = ints.stream().mapToInt(Integer::intValue).toArray();
        int[] sorted = sorter.sort(shuffleArray);
        for (int i = 1; i < sorted.length; i++) {
            Assert.assertTrue(sorted[i - 1] < sorted[i]);
        }
    }
}
