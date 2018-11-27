package CodingBat.String01Test;

import CodingBat.String01.WithoutX;
import org.junit.Assert;
import org.junit.Test;

public class WithoutXTest {
    @Test
    public void xHixTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("Hi", wx.withoutX("xHix"));
    }

    @Test
    public void xHiTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("Hi", wx.withoutX("xHi"));
    }

    @Test
    public void HixTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("Hi", wx.withoutX("Hix"));
    }

    @Test
    public void HxixTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("Hxi", wx.withoutX("Hxix"));
    }

    @Test
    public void xxxxTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("xx", wx.withoutX("xxxx"));
    }

    @Test
    public void xxTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("", wx.withoutX("xx"));
    }

    @Test
    public void aleTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("ale", wx.withoutX("alex"));
    }

    @Test
    public void katyaTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("katya", wx.withoutX("katya"));
    }

    @Test
    public void xTest() {
        WithoutX wx = new WithoutX();
        Assert.assertEquals("", wx.withoutX("x"));
    }
}
