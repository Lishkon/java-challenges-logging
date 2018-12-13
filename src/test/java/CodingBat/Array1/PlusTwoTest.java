package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class PlusTwoTest {
    @Test
    public void sampleTest() {
        PlusTwo pt = new PlusTwo();
        Assert.assertArrayEquals(new int[]{1, 2, 3, 4}, pt.plusTwo(new int[]{1, 2}, new int[] {3, 4}));
    }
}
