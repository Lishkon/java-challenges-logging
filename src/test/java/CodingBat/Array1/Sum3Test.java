package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class Sum3Test {
    @Test
    public void sumTest() {
        Sum3 s3 = new Sum3();
        Assert.assertEquals(6, s3.sum3(new int[]{1,2,3}));
        Assert.assertEquals(7, s3.sum3(new int[]{7,0,0}));
        Assert.assertEquals(0, s3.sum3(new int[]{0,0,0}));
    }
}
