package kyu8.Warmup02Test;

import kyu8.Warmup02.DoubleX;
import org.junit.Assert;
import org.junit.Test;

public class DoubleXTest {
    @Test
    public void xxxxTest() {
        Assert.assertTrue(DoubleX.doubleX("xxxx"));
    }

    @Test
    public void axxbbTest() {
        Assert.assertTrue(DoubleX.doubleX("axxbb"));
    }

    @Test
    public void axaxaxaTest() {
        Assert.assertFalse(DoubleX.doubleX("axaxaxa"));
    }

    @Test
    public void aaaaxTest() {
        Assert.assertFalse(DoubleX.doubleX("aaaax"));
    }

    @Test
    public void emptyTest() {
        Assert.assertFalse(DoubleX.doubleX(""));
    }

    @Test
    public void singleXTest() {
        Assert.assertFalse(DoubleX.doubleX("x"));
    }

}
