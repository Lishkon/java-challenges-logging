package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class BiggerTwoTest {
    @Test
    public void posTest() {
        BiggerTwo bt = new BiggerTwo();
        Assert.assertArrayEquals(new int[]{3,4}, bt.biggerTwo(new int[]{1,2}, new int[]{3,4}));
        Assert.assertArrayEquals(new int[]{3,4}, bt.biggerTwo(new int[]{3,4}, new int[]{1,2}));
        Assert.assertArrayEquals(new int[]{1,2}, bt.biggerTwo(new int[]{1,1}, new int[]{1,2}));
        Assert.assertArrayEquals(new int[]{1,2}, bt.biggerTwo(new int[]{2,2}, new int[]{1,2}));
    }
}
