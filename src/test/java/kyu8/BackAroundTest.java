package kyu8;

import org.junit.Assert;
import org.junit.Test;

public class BackAroundTest {
    @Test
    public void test(){
        BackAround b = new BackAround();
        Assert.assertEquals(b.backAround("a"), "aaa");
        Assert.assertEquals(b.backAround("test"), "ttestt");
        Assert.assertEquals(b.backAround("Hi"), "iHii");
    }
}
