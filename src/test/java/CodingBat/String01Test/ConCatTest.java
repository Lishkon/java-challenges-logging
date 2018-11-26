package CodingBat.String01Test;

import CodingBat.String01.ConCat;
import org.junit.Assert;
import org.junit.Test;

public class ConCatTest {
    @Test
    public void abcatTest() {
        ConCat cc = new ConCat();
        Assert.assertEquals("abcat", cc.conCat("abc", "cat"));
    }

    @Test
    public void dogcatTest() {
        ConCat cc = new ConCat();
        Assert.assertEquals("dogcat", cc.conCat("dog", "cat"));
    }

    @Test
    public void abcTest() {
        ConCat cc = new ConCat();
        Assert.assertEquals("abc", cc.conCat("abc", ""));
    }

    @Test
    public void emptyTest() {
        ConCat cc = new ConCat();
        Assert.assertEquals("", cc.conCat("", ""));
    }
}
