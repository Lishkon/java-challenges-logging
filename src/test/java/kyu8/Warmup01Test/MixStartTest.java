package kyu8.Warmup01Test;

import kyu8.Warmup01.MixStart;
import org.junit.Assert;
import org.junit.Test;

public class MixStartTest {
    @Test
    public void test() {
        Assert.assertTrue(MixStart.mixStart("mix snacks"));
        Assert.assertTrue(MixStart.mixStart("pix snacks"));
        Assert.assertFalse(MixStart.mixStart("piz snacks"));
        Assert.assertFalse(MixStart.mixStart("papaguinea"));
        Assert.assertFalse(MixStart.mixStart("ixis rutus"));
        Assert.assertFalse(MixStart.mixStart("ix"));
        Assert.assertFalse(MixStart.mixStart("n"));
        Assert.assertFalse(MixStart.mixStart(""));

    }
}
