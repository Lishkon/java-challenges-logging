package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Has23Test {
    @Test
    public void positiveTest() {
        Has23 h23 = new Has23();
        Assert.assertTrue(h23.has23(new int[]{2, 5}));
        Assert.assertTrue(h23.has23(new int[]{4, 3}));
    }

    @Test
    public void negativeTest() {
        Has23 h23 = new Has23();
        Assert.assertTrue(h23.has23(new int[]{2, 5}));

    }
}
