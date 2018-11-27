package CodingBat.String01Test;

import CodingBat.String01.FirstTwo;
import org.junit.Assert;
import org.junit.Test;

public class FirstTwoTest {
    @Test
    public void helloTest() {
        FirstTwo ft = new FirstTwo();
        Assert.assertEquals("He", ft.firstTwo("Hello"));
    }

    @Test
    public void abcdefgTest() {
        FirstTwo ft = new FirstTwo();
        Assert.assertEquals("ab", ft.firstTwo("abcdefg"));
    }

    @Test
    public void abTest() {
        FirstTwo ft = new FirstTwo();
        Assert.assertEquals("ab", ft.firstTwo("ab"));
    }

    @Test
    public void oneCharTest() {
        FirstTwo ft = new FirstTwo();
        Assert.assertEquals("x", ft.firstTwo("x"));
    }

    @Test
    public void emptyAssertTest() {
        FirstTwo ft = new FirstTwo();
        Assert.assertEquals("", ft.firstTwo(""));
    }
}
