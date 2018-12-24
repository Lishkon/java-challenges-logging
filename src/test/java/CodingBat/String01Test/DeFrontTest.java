package CodingBat.String01Test;

import CodingBat.String01.DeFront;
import org.junit.Assert;
import org.junit.Test;

public class DeFrontTest {
    @Test
    public void sampleTest() {
        DeFront df = new DeFront();
        Assert.assertEquals("llo", df.deFront("Hello"));
        Assert.assertEquals("va", df.deFront("java"));
        Assert.assertEquals("aay", df.deFront("away"));
        Assert.assertEquals("bay", df.deFront("ebay"));
    }
}
