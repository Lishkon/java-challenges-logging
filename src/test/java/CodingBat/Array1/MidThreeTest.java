package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class MidThreeTest {
    @Test
    public void sampleTest() {
        MidThree mt = new MidThree();
        Assert.assertArrayEquals(new int[]{2, 3, 4}, mt.midThree(new int[]{1, 2, 3, 4, 5}));
        Assert.assertArrayEquals(new int[]{1, 2, 3}, mt.midThree(new int[]{1, 2, 3}));
    }
}
