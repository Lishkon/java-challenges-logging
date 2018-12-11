package CodingBat.Array1;

<<<<<<< HEAD
import org.junit.Assert;
import org.junit.Test;

public class Unlucky1Test {
    @Test
    public void sampleTest() {
        Unlucky1 u1 = new Unlucky1();
        Assert.assertTrue(u1.unlucky1(new int[]{1, 3, 4, 5}));
        Assert.assertTrue(u1.unlucky1(new int[]{2, 1, 3, 4, 5}));
        Assert.assertFalse(u1.unlucky1(new int[]{1, 1, 1}));
        Assert.assertFalse(u1.unlucky1(new int[]{1, 1, 1, 3, 1}));
    }

    @Test
    public void edgeCase() {
        Unlucky1 u1 = new Unlucky1();
        Assert.assertFalse(u1.unlucky1(new int[]{1, 1, 1, 3, 1}));
    }
=======
public class Unlucky1Test {
>>>>>>> master
}
