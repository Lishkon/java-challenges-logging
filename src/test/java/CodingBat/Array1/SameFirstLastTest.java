package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTest {
    @Test
    public void positiveTest() {
        SameFirstLast sfl = new SameFirstLast();
        Assert.assertTrue(sfl.sameFirstLast(new int[] {1, 2, 3, 1}));
        Assert.assertTrue(sfl.sameFirstLast(new int[] {1, 2, 1}));
        Assert.assertTrue(sfl.sameFirstLast(new int[] {1}));
    }

    @Test
    public void negativeTest() {
        SameFirstLast sfl = new SameFirstLast();
        Assert.assertFalse(sfl.sameFirstLast(new int[] {1, 2, 3}));
        Assert.assertFalse(sfl.sameFirstLast(new int[] {}));

    }
}
