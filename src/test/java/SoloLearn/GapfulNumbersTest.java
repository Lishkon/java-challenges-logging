package SoloLearn;

import org.junit.Assert;
import org.junit.Test;

public class GapfulNumbersTest {
    @Test
    public void test(){
        Assert.assertTrue(GapfulNumbers.gapNum(121));
        Assert.assertFalse(GapfulNumbers.gapNum(125));
        Assert.assertFalse(GapfulNumbers.gapNum(5566));
        Assert.assertFalse(GapfulNumbers.gapNum(210));
        Assert.assertTrue(GapfulNumbers.gapNum(10));
        Assert.assertTrue(GapfulNumbers.gapNum(192));
        Assert.assertTrue(GapfulNumbers.gapNum(583));
    }
}
