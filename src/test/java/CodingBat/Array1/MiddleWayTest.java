package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class MiddleWayTest {
    @Test
    public void test() {
        MiddleWay mw = new MiddleWay();
        Assert.assertArrayEquals(new int[]{7,8}, mw.middleWay(new int[]{1,7,3}, new int[]{4,8,9}));
    }

    @Test
    public void oneMoreTest() {
        MiddleWay mw = new MiddleWay();
        Assert.assertArrayEquals(new int[]{2,5}, mw.middleWay(new int[]{1,2,3}, new int[]{4,5,6}));
    }
}
