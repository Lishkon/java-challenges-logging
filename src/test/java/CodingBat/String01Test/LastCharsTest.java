package CodingBat.String01Test;

import CodingBat.String01.LastChars;
import org.junit.Assert;
import org.junit.Test;

public class LastCharsTest {
    @Test
    public void lsTest() {
        LastChars ls = new LastChars();
        Assert.assertEquals("ls", ls.lastChars("last", "chars"));
    }

    @Test
    public void yaTest() {
        LastChars ls = new LastChars();
        Assert.assertEquals("ya", ls.lastChars("yo", "java"));
    }

    @Test
    public void h_Test() {
        LastChars ls = new LastChars();
        Assert.assertEquals("h@", ls.lastChars("hi", ""));
    }

    @Test
    public void __Test() {
        LastChars ls = new LastChars();
        Assert.assertEquals("@@", ls.lastChars("", ""));
    }
}
