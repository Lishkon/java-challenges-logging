package CodingBat.String01Test;

import CodingBat.String01.ComboString;
import org.junit.Assert;
import org.junit.Test;

public class ComboStringTest {
    @Test
    public void hiHelloHiTest() {
        ComboString cs = new ComboString();
        Assert.assertEquals("hiHellohi", cs.comboString("Hello", "hi"));
    }

    @Test
    public void hiHelloHi2Test() {
        ComboString cs = new ComboString();
        Assert.assertEquals("hiHellohi", cs.comboString("hi", "Hello"));
    }

    @Test
    public void baaabTest() {
        ComboString cs = new ComboString();
        Assert.assertEquals("baaab", cs.comboString("aaa", "b"));
    }
    @Test
    public void aaaTest() {
        ComboString cs = new ComboString();
        Assert.assertEquals("aaa", cs.comboString("aaa", ""));
    }

}
