package kyu8.WarmupTest;

import kyu8.Warmup.StringE;
import org.junit.Assert;
import org.junit.Test;

public class StringETest {
    @Test
    public void simplePositiveTest() {
        Assert.assertTrue(StringE.stringE("Hello"));
    }

    @Test
    public void ePositiveTest() {
        Assert.assertTrue(StringE.stringE("e"));
    }

    @Test
    public void multipleEPositiveTest() {
        Assert.assertFalse(StringE.stringE("Heeelelo"));
    }

    @Test
    public void simpleNegativeTest() {
        Assert.assertFalse(StringE.stringE(""));
    }
}
