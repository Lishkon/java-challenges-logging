package CodingBat.String01Test;

import CodingBat.String01.MakeOutWord;
import org.junit.Assert;
import org.junit.Test;

public class MakeOutWordTest {
    @Test
    public void yayTest() {
        MakeOutWord mow = new MakeOutWord();
        Assert.assertEquals("<<Yay>>", mow.makeOutWord("<<>>", "Yay"));
    }

    @Test
    public void wooHooTest() {
        MakeOutWord mow = new MakeOutWord();
        Assert.assertEquals("<<WooHoo>>", mow.makeOutWord("<<>>", "WooHoo"));
    }

    @Test
    public void wordTest() {
        MakeOutWord mow = new MakeOutWord();
        Assert.assertEquals("[[word]]", mow.makeOutWord("[[]]", "word"));
    }
}
