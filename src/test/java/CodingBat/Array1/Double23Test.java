package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Double23Test {
    @Test
    public void posTests() {
        Double23 d23 = new Double23();
        Assert.assertTrue(d23.double23(new int[]{2,2}));
        Assert.assertTrue(d23.double23(new int[]{3,3}));
    }

    @Test
    public void negTests() {
        Double23 d23 = new Double23();
        Assert.assertFalse(d23.double23(new int[]{2,1}));
        Assert.assertFalse(d23.double23(new int[]{2,3}));
        Assert.assertFalse(d23.double23(new int[]{2,3,4, 5,6,6,7}));
        Assert.assertFalse(d23.double23(new int[]{1}));
        Assert.assertFalse(d23.double23(new int[]{}));

    }
}
