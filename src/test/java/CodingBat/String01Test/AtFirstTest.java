package CodingBat.String01Test;

import CodingBat.String01.AtFirst;
import org.junit.Assert;
import org.junit.Test;

public class AtFirstTest {
    @Test
    public void helloTest() {
        AtFirst af = new AtFirst();
        Assert.assertEquals("he", af.atFirst("hello"));
    }

    @Test
    public void hiTest() {
        AtFirst af = new AtFirst();
        Assert.assertEquals("hi", af.atFirst("hi"));
    }

    @Test
    public void h_Test() {
        AtFirst af = new AtFirst();
        Assert.assertEquals("h@", af.atFirst("h"));
    }

    @Test
    public void emptyTest() {
        AtFirst af = new AtFirst();
        Assert.assertEquals("@@", af.atFirst(""));
    }
}
