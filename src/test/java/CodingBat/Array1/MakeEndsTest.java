package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class MakeEndsTest {
    @Test
    public void sampleTest() {
        MakeEnds me = new MakeEnds();
        Assert.assertArrayEquals(new int[]{1,3}, me.makeEnds(new int[]{1,2,3}));
        Assert.assertArrayEquals(new int[]{1,1}, me.makeEnds(new int[]{1}));
    }
}
