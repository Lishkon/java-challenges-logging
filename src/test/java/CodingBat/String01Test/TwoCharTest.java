package CodingBat.String01Test;

import CodingBat.String01.TwoChar;
import org.junit.Assert;
import org.junit.Test;

public class TwoCharTest {
    @Test
    public void java0Test() {
        TwoChar tc = new TwoChar();
        Assert.assertEquals("ja", tc.twoChar("java", 0));
    }

    @Test
    public void java2Test() {
        TwoChar tc = new TwoChar();
        Assert.assertEquals("va", tc.twoChar("java", 2));
    }

    @Test
    public void java3Test() {
        TwoChar tc = new TwoChar();
        Assert.assertEquals("ja", tc.twoChar("java", 3));
    }

    @Test
    public void alex0Test() {
        TwoChar tc = new TwoChar();
        Assert.assertEquals("al", tc.twoChar("alex", 0));
    }

    @Test
    public void alex1Test() {
        TwoChar tc = new TwoChar();
        Assert.assertEquals("le", tc.twoChar("alex", 1));
    }

    @Test
    public void javaNegTest() {
        TwoChar tc = new TwoChar();
        Assert.assertEquals("ja", tc.twoChar("java", -1));
    }

}
