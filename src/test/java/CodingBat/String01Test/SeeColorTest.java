package CodingBat.String01Test;

import CodingBat.String01.SeeColor;
import org.junit.Assert;
import org.junit.Test;

public class SeeColorTest {
    @Test
    public void redxxTest() {
        SeeColor sc = new SeeColor();
        Assert.assertEquals("red", sc.seeColor("redxx"));
    }

    @Test
    public void xxredTest() {
        SeeColor sc = new SeeColor();
        Assert.assertEquals("", sc.seeColor("xxred"));
    }

    @Test
    public void blueTimesTest() {
        SeeColor sc = new SeeColor();
        Assert.assertEquals("blue", sc.seeColor("blueTimes"));
    }

    @Test
    public void getblueTest() {
        SeeColor sc = new SeeColor();
        Assert.assertEquals("", sc.seeColor("getblue"));
    }
}
