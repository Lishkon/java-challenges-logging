package CodingBat.String01Test;

import CodingBat.String01.ExtraFront;
import org.junit.Assert;
import org.junit.Test;

public class ExtraFrontTest {
    @Test
    public void helloTest() {
        ExtraFront ef = new ExtraFront();
        Assert.assertEquals("HeHeHe", ef.extraFront("Hello"));
    }

    @Test
    public void abTest() {
        ExtraFront ef = new ExtraFront();
        Assert.assertEquals("ababab", ef.extraFront("ab"));
    }

    @Test
    public void hTest() {
        ExtraFront ef = new ExtraFront();
        Assert.assertEquals("hhh", ef.extraFront("h"));
    }

    @Test
    public void emptyTest() {
        ExtraFront ef = new ExtraFront();
        Assert.assertEquals("", ef.extraFront(""));
    }
}
