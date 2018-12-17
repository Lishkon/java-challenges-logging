package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class SwapEndsTest {
    @Test
    public void posTest() {
        SwapEnds se = new SwapEnds();
        Assert.assertArrayEquals(new int[]{4, 2, 3, 1}, se.swapEnds(new int[]{1, 2, 3, 4}));
        Assert.assertArrayEquals(new int[]{3, 2, 1}, se.swapEnds(new int[]{1, 2, 3}));
    }
}
