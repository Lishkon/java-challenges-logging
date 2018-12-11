package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Test {
    @Test
    public void sampleTest() {
        MaxEnd3 me3 = new MaxEnd3();
        Assert.assertArrayEquals(new int[]{3, 3, 3}, me3.maxEnd3(new int[]{1, 2, 3}));
    }
}
