package CodingBat.String01Test;

import CodingBat.String01.MiddleTwo;
import org.junit.Assert;
import org.junit.Test;

public class MiddleTwoTest {
    @Test
    public void stringTest() {
        MiddleTwo mt = new MiddleTwo();
        Assert.assertEquals("ri", mt.middleTwo("string"));
    }

    @Test
    public void codeTest() {
        MiddleTwo mt = new MiddleTwo();
        Assert.assertEquals("od", mt.middleTwo("code"));
    }

    @Test
    public void practiceTest() {
        MiddleTwo mt = new MiddleTwo();
        Assert.assertEquals("ct", mt.middleTwo("Prctice"));
    }
}
