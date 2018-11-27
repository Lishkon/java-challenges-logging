package CodingBat.String01Test;

import CodingBat.String01.Without2;
import org.junit.Assert;
import org.junit.Test;

public class Without2Test {
    @Test
    public void helloHeTest() {
        Without2 w2 = new Without2();
        Assert.assertEquals("lloHe", w2.without2("HelloHe"));
    }

    @Test
    public void helloHiTest() {
        Without2 w2 = new Without2();
        Assert.assertEquals("HelloHi", w2.without2("HelloHi"));
    }

    @Test
    public void hiTest() {
        Without2 w2 = new Without2();
        Assert.assertEquals("", w2.without2("Hi"));
    }

}
