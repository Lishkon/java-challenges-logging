package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Sum2Test {
    @Test
    public void posTest() {
        Sum2 s2 = new Sum2();
        Assert.assertEquals(3, s2.sum2(new int[]{1, 2, 3}));
        Assert.assertEquals(3, s2.sum2(new int[]{1, 2}));
        Assert.assertEquals(1, s2.sum2(new int[]{1}));
        Assert.assertEquals(0, s2.sum2(new int[]{}));
    }
}
