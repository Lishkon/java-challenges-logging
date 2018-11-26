package CodingBat.String01Test;

import CodingBat.String01.HasBad;
import org.junit.Assert;
import org.junit.Test;

public class HasBadTest {
    @Test
    public void badxxTest() {
        HasBad hb = new HasBad();
        Assert.assertTrue(hb.hasBad("baddxx"));
    }

    @Test
    public void xbadxxTest() {
        HasBad hb = new HasBad();
        Assert.assertTrue(hb.hasBad("xbaddxx"));
    }

    @Test
    public void badTest() {
        HasBad hb = new HasBad();
        Assert.assertTrue(hb.hasBad("bad"));
    }

    @Test
    public void xxbadxxTest() {
        HasBad hb = new HasBad();
        Assert.assertFalse(hb.hasBad("xxbaddxx"));
    }

    @Test
    public void baTest() {
        HasBad hb = new HasBad();
        Assert.assertFalse(hb.hasBad("ba"));
    }

    @Test
    public void xbaTest() {
        HasBad hb = new HasBad();
        Assert.assertFalse(hb.hasBad("xba"));
    }

    @Test
    public void xbadTest() {
        HasBad hb = new HasBad();
        Assert.assertTrue(hb.hasBad("xbad"));
    }

    @Test
    public void emptyTest() {
        HasBad hb = new HasBad();
        Assert.assertFalse(hb.hasBad(""));
    }
}
