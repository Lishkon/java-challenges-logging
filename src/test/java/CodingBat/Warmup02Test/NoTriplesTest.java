package CodingBat.Warmup02Test;

import CodingBat.Warmup02.NoTriples;
import org.junit.Assert;
import org.junit.Test;

public class NoTriplesTest {
    NoTriples nt = new NoTriples();
    @Test
    public void simpleThreeItemsTest() {
        Assert.assertTrue(nt.noTriples(new int[]{1,2,3}));
    }

    @Test
    public void simpleThreeTripleItemsTest() {
        Assert.assertFalse(nt.noTriples(new int[]{1,1,1}));
    }

    @Test
    public void largerTripleItemsTest() {
        Assert.assertFalse(nt.noTriples(new int[]{1,1,2,2,2,1}));
    }

    @Test
    public void doubleTripleItemsTest() {
        Assert.assertFalse(nt.noTriples(new int[]{1,1,1,2,2,2}));
    }

    @Test
    public void emptyArrayTest() {
        Assert.assertTrue(nt.noTriples(new int[]{}));
    }
}
