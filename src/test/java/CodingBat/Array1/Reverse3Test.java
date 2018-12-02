package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Reverse3Test {
    @Test
    public void testOneTest() {
        Reverse3 r3 = new Reverse3();
        Assert.assertArrayEquals(new int[]{1,2,3}, r3.reverse3(new int[]{3,2,1}));
    }

    @Test
    public void testTwoTest() {
        Reverse3 r3 = new Reverse3();
        Assert.assertArrayEquals(new int[]{1}, r3.reverse3(new int[]{1}));
    }

    @Test
    public void testThreeTest() {
        Reverse3 r3 = new Reverse3();
        Assert.assertArrayEquals(new int[]{7,0,0}, r3.reverse3(new int[]{0,0,7}));
    }
}
