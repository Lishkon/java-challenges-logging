package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Make2Test {
    @Test
    public void sampleTest() {
        Make2 m2 = new Make2();
        Assert.assertArrayEquals(new int[]{4, 5}, m2.make2(new int[]{4, 5}, new int[]{1,2,3}));
        Assert.assertArrayEquals(new int[]{4, 1}, m2.make2(new int[]{4}, new int[]{1,2,3}));
    }

    public void leftEmptyTest() {
        Make2 m2 = new Make2();
        Assert.assertArrayEquals(new int[]{1, 2}, m2.make2(new int[]{}, new int[]{1,2,3}));
        Assert.assertArrayEquals(new int[]{0, 1}, m2.make2(new int[]{}, new int[]{1}));
    }

    public void rightEmptyTest() {
        Make2 m2 = new Make2();
        Assert.assertArrayEquals(new int[]{1, 2}, m2.make2(new int[]{1,2,3}, new int[]{}));
        Assert.assertArrayEquals(new int[]{1, 0}, m2.make2(new int[]{1}, new int[]{}));
    }

    public void bothEmptyTest() {
        Make2 m2 = new Make2();
        Assert.assertArrayEquals(new int[]{0, 0}, m2.make2(new int[]{}, new int[]{}));

    }
}
