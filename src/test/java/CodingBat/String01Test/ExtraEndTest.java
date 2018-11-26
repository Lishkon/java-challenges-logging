package CodingBat.String01Test;

import CodingBat.String01.ExtraEnd;
import org.junit.Assert;
import org.junit.Test;

public class ExtraEndTest {
    @Test
    public void helloTest() {
        ExtraEnd ee = new ExtraEnd();
        Assert.assertEquals("lololo", ee.extraEnd("Hello"));
    }

    @Test
    public void abTest() {
        ExtraEnd ee = new ExtraEnd();
        Assert.assertEquals("ababab", ee.extraEnd("ab"));
    }

    @Test
    public void hiTest() {
        ExtraEnd ee = new ExtraEnd();
        Assert.assertEquals("hihihi", ee.extraEnd("hi"));
    }
}
