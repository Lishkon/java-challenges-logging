package CodingBat.String01Test;

import CodingBat.String01.FirstHalf;
import org.junit.Assert;
import org.junit.Test;

public class FirstHalfTest {
    @Test
    public void simpleTest() {
        FirstHalf fh = new FirstHalf();
        Assert.assertEquals("Woo", fh.firstHalf("WooHoo"));
    }

    @Test
    public void helloThereTest() {
        FirstHalf fh = new FirstHalf();
        Assert.assertEquals("Hello", fh.firstHalf("HelloThere"));
    }

    @Test
    public void abcTest() {
        FirstHalf fh = new FirstHalf();
        Assert.assertEquals("abc", fh.firstHalf("abcdef"));
    }
}
