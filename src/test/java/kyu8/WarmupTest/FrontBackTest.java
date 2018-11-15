package kyu8.WarmupTest;

import kyu8.Warmup.FrontBack;
import org.junit.Assert;
import org.junit.Test;

public class FrontBackTest {
    FrontBack fb = new FrontBack();

    @Test
    public void simpleCharTest(){
        Assert.assertEquals("a", fb.frontBack("a"));
    }

    @Test
    public void doubleCharTest() {
        Assert.assertEquals("ba", fb.frontBack("ab"));
    }

    @Test
    public void threeCharTest() {
        Assert.assertEquals("cba", fb.frontBack("abc"));
    }

    @Test
    public void longerWordTest() {
        Assert.assertEquals("eodc", fb.frontBack("code"));
    }
}
