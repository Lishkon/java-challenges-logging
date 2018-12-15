package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class MaxTripleTest {
    @Test
    public void firstTest() {
        MaxTriple mt = new MaxTriple();
        Assert.assertEquals(3, mt.maxTriple(new int[]{3,2,1}));
        Assert.assertEquals(5, mt.maxTriple(new int[]{5, 2, 3}));
        Assert.assertEquals(5, mt.maxTriple(new int[]{5, 1, 3, 7, 1}));
        Assert.assertEquals(5, mt.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 1}));
    }

    @Test
    public void middleTest() {
        MaxTriple mt = new MaxTriple();
        Assert.assertEquals(8, mt.maxTriple(new int[]{1,8,3}));
        Assert.assertEquals(3, mt.maxTriple(new int[]{1, 2, 3, 1, 1}));
        Assert.assertEquals(9, mt.maxTriple(new int[]{5, 1, 7, 9, 7, 8, 1}));
        Assert.assertEquals(5, mt.maxTriple(new int[]{2, 2, 5, 1, 1}));
    }

    @Test
    public void lastTest() {
        MaxTriple mt = new MaxTriple();
        Assert.assertEquals(8, mt.maxTriple(new int[]{1,8,3}));
        Assert.assertEquals(5, mt.maxTriple(new int[]{1, 7, 3, 1, 5}));
        Assert.assertEquals(9, mt.maxTriple(new int[]{5, 1, 7, 3, 7, 8, 9}));
    }
}
