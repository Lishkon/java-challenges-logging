package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class MakeLastTest {
    @Test
    public void sampleTest() {
        MakeLast ml = new MakeLast();
        Assert.assertArrayEquals(new int[]{0, 0, 0, 0, 0, 6}, ml.makeLast(new int[]{4,5,6}));
        Assert.assertArrayEquals(new int[]{0, 3}, ml.makeLast(new int[]{3}));
    }
}
