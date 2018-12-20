package CodingBat.Warmup02Test;

import CodingBat.Warmup02.Array123;
import org.junit.Assert;
import org.junit.Test;

public class Array123Test {
    @Test
    public void sampleTest() {
        Array123 a123 = new Array123();
        Assert.assertTrue(a123.array123(new int[]{1, 1, 2, 3, 1}));
        Assert.assertTrue(a123.array123(new int[]{1, 2, 3}));
        Assert.assertTrue(a123.array123(new int[]{1, 1, 2, 1, 2, 3}));
    }

    @Test
    public void negTest() {
        Array123 a123 = new Array123();
        Assert.assertFalse(a123.array123(new int[]{1, 1, 2, 1, 1}));
        Assert.assertFalse(a123.array123(new int[]{}));
        Assert.assertFalse(a123.array123(new int[]{3,2,1}));
        Assert.assertFalse(a123.array123(new int[]{1,3,2}));
    }
}
