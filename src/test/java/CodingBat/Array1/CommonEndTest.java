package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class CommonEndTest {
    @Test
    public void simpleTest() {
        CommonEnd ce = new CommonEnd();
        Assert.assertTrue(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3}));
    }

    @Test
    public void sampleTest() {
        CommonEnd ce = new CommonEnd();
        Assert.assertFalse(ce.commonEnd(new int[]{1, 2, 3}, new int[]{7, 3,2}));
    }

    @Test
    public void singleTest() {
        CommonEnd ce = new CommonEnd();
        Assert.assertTrue(ce.commonEnd(new int[]{1}, new int[]{1}));
    }

    @Test
    public void oneMoreSingleTest() {
        CommonEnd ce = new CommonEnd();
        Assert.assertTrue(ce.commonEnd(new int[]{1,2,3}, new int[]{1}));
    }

    @Test
    public void oneOneMoreSingleTest() {
        CommonEnd ce = new CommonEnd();
        Assert.assertTrue(ce.commonEnd(new int[]{1}, new int[]{1,2,3}));
    }




}
