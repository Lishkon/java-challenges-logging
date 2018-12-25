package CodingBat.Array02Test;

import CodingBat.Array02.CountEvens;
import org.junit.Assert;
import org.junit.Test;

public class CountEvensTest {
    @Test
    public void sampleTest() {
        CountEvens ce = new CountEvens();
        Assert.assertEquals(3, ce.countEvens(new int[]{2, 1, 2, 3, 4}));
        Assert.assertEquals(3, ce.countEvens(new int[]{2, 2, 0}));
        Assert.assertEquals(0, ce.countEvens(new int[]{1, 3, 5}));
    }
}
