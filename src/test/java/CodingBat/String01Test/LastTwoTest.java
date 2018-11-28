package CodingBat.String01Test;

import CodingBat.String01.LastTwo;
import org.junit.Assert;
import org.junit.Test;

public class LastTwoTest {
    @Test
    public void codingTest() {
        LastTwo lt = new LastTwo();
        Assert.assertEquals("codign", lt.lastTwo("coding"));
    }

    @Test
    public void catTest() {
        LastTwo lt = new LastTwo();
        Assert.assertEquals("cta", lt.lastTwo("cat"));
    }

    @Test
    public void baTest() {
        LastTwo lt = new LastTwo();
        Assert.assertEquals("ab", lt.lastTwo("ba"));
    }

    @Test
    public void emptyTest() {
        LastTwo lt = new LastTwo();
        Assert.assertEquals("", lt.lastTwo(""));
    }

}
