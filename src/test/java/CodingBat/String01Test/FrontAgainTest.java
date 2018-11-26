package CodingBat.String01Test;

import CodingBat.String01.FrontAgain;
import org.junit.Assert;
import org.junit.Test;

public class FrontAgainTest {
    @Test
    public void editedTest() {
        FrontAgain fa = new FrontAgain();
        Assert.assertTrue(fa.frontAgain("edited"));
    }

    @Test
    public void editTest() {
        FrontAgain fa = new FrontAgain();
        Assert.assertFalse(fa.frontAgain("edit"));
    }

    @Test
    public void edTest() {
        FrontAgain fa = new FrontAgain();
        Assert.assertTrue(fa.frontAgain("ed"));
    }

    @Test
    public void emptyTest() {
        FrontAgain fa = new FrontAgain();
        Assert.assertFalse(fa.frontAgain(""));
    }

    @Test
    public void jjjkTest() {
        FrontAgain fa = new FrontAgain();
        Assert.assertFalse(fa.frontAgain("jjjk"));
    }

    @Test
    public void xTest() {
        FrontAgain fa = new FrontAgain();
        Assert.assertFalse(fa.frontAgain("x"));
    }
}
