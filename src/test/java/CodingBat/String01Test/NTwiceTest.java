package CodingBat.String01Test;

import CodingBat.String01.NTwice;
import org.junit.Assert;
import org.junit.Test;

public class NTwiceTest {
    @Test
    public void helloTest() {
        NTwice nt = new NTwice();
        Assert.assertEquals("Helo", nt.nTwice("Hello", 2));
    }

    @Test
    public void chocolte3Test() {
        NTwice nt = new NTwice();
        Assert.assertEquals("Choate", nt.nTwice("Chocolate", 3));
    }

    @Test
    public void chocolte1Test() {
        NTwice nt = new NTwice();
        Assert.assertEquals("Ce", nt.nTwice("Chocolate", 1));
    }
}
