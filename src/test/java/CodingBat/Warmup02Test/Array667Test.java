package CodingBat.Warmup02Test;

import CodingBat.Warmup02.Array667;
import org.junit.Assert;
import org.junit.Test;

public class Array667Test {
    @Test
    public void _66Test() {
        Array667 a667 = new Array667();
        Assert.assertEquals(1, a667.array667(new int[] {6, 6, 2}));
    }

    @Test
    public void _66_1Test() {
        Array667 a667 = new Array667();
        Assert.assertEquals(1, a667.array667(new int[] {6, 6, 2, 6}));
    }

    @Test
    public void _67Test() {
        Array667 a667 = new Array667();
        Assert.assertEquals(1, a667.array667(new int[] {6, 7, 2, 6}));
    }

    @Test
    public void _163Test() {
        Array667 a667 = new Array667();
        Assert.assertEquals(0, a667.array667(new int[] {1,6,3}));
    }

    @Test
    public void _61Test() {
        Array667 a667 = new Array667();
        Assert.assertEquals(0, a667.array667(new int[] {6,1}));
    }

    @Test
    public void _3667Test() {
        Array667 a667 = new Array667();
        Assert.assertEquals(2, a667.array667(new int[] {3,6,6,7}));
    }

    @Test
    public void _6366Test() {
        Array667 a667 = new Array667();
        Assert.assertEquals(1, a667.array667(new int[] {6,3,6,6}));
    }
}
