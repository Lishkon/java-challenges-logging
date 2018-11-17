package kyu8.Warmup02Test;

import kyu8.Warmup02.ArrayCount9;
import org.junit.Assert;
import org.junit.Test;

public class ArrayCount9Test {
    @Test
    public void oneTest() {
        Assert.assertEquals(1, ArrayCount9.arrayCount9(new int[]{1, 2, 9}));
    }

    @Test
    public void twoTest() {
        Assert.assertEquals(2, ArrayCount9.arrayCount9(new int[]{9, 2, 9}));
    }

    @Test
    public void zeroTest() {
        Assert.assertEquals(0, ArrayCount9.arrayCount9(new int[]{1, 2, 3}));
    }

    @Test
    public void threeTest() {
        Assert.assertEquals(3, ArrayCount9.arrayCount9(new int[]{9, 9, 9}));
    }

    @Test
    public void fourTest() {
        Assert.assertEquals(3, ArrayCount9.arrayCount9(new int[]{1, 9, 9, 3, 9}));
    }
}
