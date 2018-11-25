package CodingBat.String01Test;

import CodingBat.String01.TheEnd;
import org.junit.Assert;
import org.junit.Test;

public class TheEndTest {
    @Test
    public void trueHelloTest() {
        TheEnd te = new TheEnd();
        Assert.assertEquals("H", te.theEnd("Hello", true));
    }

    @Test
    public void falseHelloTest() {
        TheEnd te = new TheEnd();
        Assert.assertEquals("o", te.theEnd("Hello", false));
    }

    @Test
    public void trueOhTest() {
        TheEnd te = new TheEnd();
        Assert.assertEquals("o", te.theEnd("oh", true));
    }
}
