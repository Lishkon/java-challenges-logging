package CodingBat.String01Test;

import CodingBat.String01.StartWord;
import org.junit.Assert;
import org.junit.Test;

public class StartWordTest {
    @Test
    public void sampleTest() {
        StartWord stw = new StartWord();
        Assert.assertEquals("hi", stw.startWord("hippo", "hi"));
        Assert.assertEquals("hip", stw.startWord("hippo", "xip"));
        Assert.assertEquals("h", stw.startWord("hippo", "i"));
    }

    @Test
    public void negTest(){
        StartWord stw = new StartWord();
        Assert.assertEquals("", stw.startWord("h", "xi"));
    }
}
