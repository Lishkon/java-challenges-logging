package CodingBat.String01Test;

import CodingBat.String01.WithouEnd2;
import org.junit.Assert;
import org.junit.Test;

public class WithouEnd2Test {
    @Test
    public void helloTest() {
        WithouEnd2 we = new WithouEnd2();
        Assert.assertEquals("ell", we.withouEnd2("Hello"));
    }

    @Test
    public void abcTest() {
        WithouEnd2 we = new WithouEnd2();
        Assert.assertEquals("b", we.withouEnd2("abc"));
    }

    @Test
    public void twoCharLongTest() {
        WithouEnd2 we = new WithouEnd2();
        Assert.assertEquals("", we.withouEnd2("ab"));
    }

    @Test
    public void oneCharLongTest() {
        WithouEnd2 we = new WithouEnd2();
        Assert.assertEquals("", we.withouEnd2("a"));
    }

    @Test
    public void zeroCharLongTest() {
        WithouEnd2 we = new WithouEnd2();
        Assert.assertEquals("", we.withouEnd2(""));
    }
}
