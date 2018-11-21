package CodingBat.Warmup01Test;

import CodingBat.Warmup01.IntMax;
import org.junit.Assert;
import org.junit.Test;

public class IntMaxTest {
    @Test
    public void simpleTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(3, im.inMax(2,3,1));
    }
    @Test
    public void threeTwoOneTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(3, im.inMax(3,2,1));
    }

    @Test
    public void oneTwoThreeTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(3, im.inMax(1,3,2));
    }

    @Test
    public void NineThreeThreeTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(9, im.inMax(9,3,3));
    }

    @Test
    public void ThreeNineThreeTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(9, im.inMax(3,9,3));
    }

    @Test
    public void EightTwoThreeTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(8, im.inMax(8,2,3));
    }

    @Test
    public void NegativeTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(-1, im.inMax(-3,-1,-2));
    }

    @Test
    public void SixTwoFiveTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(6, im.inMax(6,2,2));
    }

    @Test
    public void FiveTwoSixTest() {
        IntMax im = new IntMax();
        Assert.assertEquals(6, im.inMax(5,2,6));
    }
}
