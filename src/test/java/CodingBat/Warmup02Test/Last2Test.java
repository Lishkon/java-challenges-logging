package CodingBat.Warmup02Test;

import CodingBat.Warmup02.Last2;
import org.junit.Assert;
import org.junit.Test;

public class Last2Test {
    Last2 l2 = new Last2();
    @Test
    public void sampleTest() {
        // Returning 1 since we have only one repeating substring: "xx"
        Assert.assertEquals(1, l2.last2("hixxhi"));
    }

    @Test
    public void oneMoreSampleTest() {
        // Returning 1 since we have only one repeating substring: "xx", we don't count the substring at the end of the String
        Assert.assertEquals(1, l2.last2("xaxxaxaxx"));
    }

    @Test
    public void yetAnotheSampleTest() {
        // Returning 2 since we have two repeating substrings: "xx" and "aa". We don't count the substring at the end of the String
        Assert.assertEquals(2, l2.last2("axxxaaxx"));
    }

    @Test
    public void returnsTwoTest() {
        // Returning 2 since we have two repeating substrings: "xx" and "aa". We don't count the substring at the end of the String
        Assert.assertEquals(2, l2.last2("axxxaaxx"));
    }

    @Test
    public void xxxxTest() {
        Assert.assertEquals(2, l2.last2("xxxx"));
    }

    @Test
    public void numsTest() {
        Assert.assertEquals(2, l2.last2("13121312"));
    }

    @Test
    public void numsTwoTest() {
        Assert.assertEquals(2, l2.last2("1717171"));
    }
}
