package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Front11Test {
    @Test
    public void posTest() {
        Front11 f11 = new Front11();
        Assert.assertArrayEquals(new int[]{1,7}, f11.front11(new int[]{1,2,3}, new int[]{7,5,3}));
        Assert.assertArrayEquals(new int[]{1,2}, f11.front11(new int[]{1}, new int[]{2}));
        Assert.assertArrayEquals(new int[]{1}, f11.front11(new int[]{1,7}, new int[]{}));
    }


}
