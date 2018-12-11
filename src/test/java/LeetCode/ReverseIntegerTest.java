package LeetCode;

import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void posTest() {
        ReverseInteger ri = new ReverseInteger();
        Assert.assertEquals(321, ri.reverse(123));
    }

    @Test
    public void negTest() {
        ReverseInteger ri = new ReverseInteger();
        Assert.assertEquals(-321, ri.reverse(-123));
    }

    @Test
    public void zeroTest() {
        ReverseInteger ri = new ReverseInteger();
        Assert.assertEquals(21, ri.reverse(120));
    }
}
