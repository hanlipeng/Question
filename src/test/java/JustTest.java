import org.junit.Test;

/**
 * @author hanlipeng
 * @date 2020/7/24
 */
public class JustTest {
    @Test
    public void test() {
        int a = 11;
        int b = 3;
        int result = a * b;

        int out = 0;
        for (int i = a, j = 0; i > 0; i = i >> 1, j++) {
            if ((i & 1) == 1) {
                out += (b << j);
            }
        }

        System.out.println(result + "," + out);
    }
}
