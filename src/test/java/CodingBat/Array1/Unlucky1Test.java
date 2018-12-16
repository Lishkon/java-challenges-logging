package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Unlucky1Test {
    @Test
    public void positiveTest() {
        Unlucky1 u1 = new Unlucky1();
        Assert.assertTrue(u1.unlucky1(new int[]{1, 3, 4, 5}));
        Assert.assertTrue(u1.unlucky1(new int[]{2, 1, 3, 4, 5}));
        Assert.assertTrue(u1.unlucky1(new int[]{1, 2, 3, 4, 1, 3}));
        Assert.assertTrue(u1.unlucky1(new int[]{1, 3}));
    }

    @Test
    public void negativeTest() {
        Unlucky1 u1 = new Unlucky1();
        Assert.assertFalse(u1.unlucky1(new int[]{3, 1}));
        Assert.assertFalse(u1.unlucky1(new int[]{1,1,1}));
        Assert.assertFalse(u1.unlucky1(new int[]{1, 1, 1, 3, 1}));
        Assert.assertFalse(u1.unlucky1(new int[]{1, 4, 1, 5}));
        Assert.assertFalse(u1.unlucky1(new int[]{}));
    }
}
