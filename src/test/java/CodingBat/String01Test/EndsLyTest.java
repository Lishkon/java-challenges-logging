package CodingBat.String01Test;

import CodingBat.String01.EndsLy;
import org.junit.Assert;
import org.junit.Test;

public class EndsLyTest {
    @Test
    public void oddlyTest() {
        EndsLy el = new EndsLy();
        Assert.assertTrue(el.endsLy("oddly"));
    }

    @Test
    public void yTest() {
        EndsLy el = new EndsLy();
        Assert.assertFalse(el.endsLy("y"));
    }

    @Test
    public void lyTest() {
        EndsLy el = new EndsLy();
        Assert.assertTrue(el.endsLy("ly"));
    }

    @Test
    public void oddyTest() {
        EndsLy el = new EndsLy();
        Assert.assertFalse(el.endsLy("oddy"));
    }
}
