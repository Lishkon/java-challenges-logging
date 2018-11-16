package kyu8.WarmupTest;

import kyu8.Warmup01.DelDel;
import org.junit.Assert;
import org.junit.Test;

public class DelDelTest {
    DelDel dl = new DelDel();
    @Test
    public void abcTest() {
        Assert.assertEquals("abc", dl.delDel("adelbc"));
    }

    @Test
    public void helloTest() {
        Assert.assertEquals("aHello", dl.delDel("adelHello"));
    }

    @Test
    public void adedbcTest() {
        Assert.assertEquals("adedbc", dl.delDel("adedbc"));
    }

    @Test
    public void addTest() {
        Assert.assertEquals("add", dl.delDel("add"));
    }

    @Test
    public void adTest() {
        Assert.assertEquals("ad", dl.delDel("ad"));
    }

    @Test
    public void delTest() {
        Assert.assertEquals("del", dl.delDel("del"));
    }

    @Test
    public void emptyTest() {
        Assert.assertEquals("", dl.delDel(""));
    }

    @Test
    public void adelTest() {
        Assert.assertEquals("a", dl.delDel("adel"));
    }

}
