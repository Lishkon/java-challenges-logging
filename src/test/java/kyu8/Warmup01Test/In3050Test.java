package kyu8.WarmupTest;

import kyu8.Warmup01.In3050;
import org.junit.Assert;
import org.junit.Test;

public class In3050Test {
    In3050 test = new In3050();
    @Test
    public void simpleTest() {
        Assert.assertTrue(test.in3050(30, 31));
    }

    @Test
    public void anotherSimpleTest() {
        Assert.assertFalse(test.in3050(30, 41));
    }

    @Test
    public void Simple4050Test() {
        Assert.assertTrue(test.in3050(40, 50));
    }
}
