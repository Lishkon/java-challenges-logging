package CodingBat.String01Test;

import CodingBat.String01.WithoutX2;
import org.junit.Assert;
import org.junit.Test;

public class WithoutX2Test {
    @Test
    public void xhiTest() {
        WithoutX2 wx2 = new WithoutX2();
        Assert.assertEquals("Hi", wx2.withoutX2("xHi"));
    }

    @Test
    public void hxiTest() {
        WithoutX2 wx2 = new WithoutX2();
        Assert.assertEquals("Hi", wx2.withoutX2("Hxi"));
    }

    @Test
    public void unchangedTest() {
        WithoutX2 wx2 = new WithoutX2();
        Assert.assertEquals("Hi", wx2.withoutX2("Hi"));
    }

    @Test
    public void xaxbTest() {
        WithoutX2 wx2 = new WithoutX2();
        Assert.assertEquals("axb", wx2.withoutX2("xaxb"));
    }

    @Test
    public void xTest() {
        WithoutX2 wx2 = new WithoutX2();
        Assert.assertEquals("", wx2.withoutX2("x"));
    }

    @Test
    public void emptyTest() {
        WithoutX2 wx2 = new WithoutX2();
        Assert.assertEquals("", wx2.withoutX2(""));
    }

    @Test
    public void xHxlloTest() {
        WithoutX2 wx2 = new WithoutX2();
        Assert.assertEquals("Hxllo", wx2.withoutX2("xHxllo"));
    }
}
