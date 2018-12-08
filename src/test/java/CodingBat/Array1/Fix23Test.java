package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Fix23Test {
    @Test
    public void sampleTest() {
        Fix23 f23 = new Fix23();
        Assert.assertArrayEquals(new int[]{1, 2, 0}, f23.fix23(new int[]{1, 2, 3}));
        Assert.assertArrayEquals(new int[]{2, 0, 5}, f23.fix23(new int[]{2, 3, 5}));
        Assert.assertArrayEquals(new int[]{1, 2, 1}, f23.fix23(new int[]{1, 2, 1}));
    }

}
