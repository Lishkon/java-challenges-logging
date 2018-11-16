package kyu8.WarmupTest;

import kyu8.Warmup01.Close10;
import org.junit.Assert;
import org.junit.Test;

public class Close10Test {
    @Test
    public void test() {
        Assert.assertTrue(Close10.close10(8, 13)==8);
        Assert.assertTrue(Close10.close10(5, 10)==10);
        Assert.assertTrue(Close10.close10(10, 10)==0);

    }
}
