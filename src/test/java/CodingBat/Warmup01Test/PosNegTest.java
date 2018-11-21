package CodingBat.Warmup01Test;

// posNeg(1, -1, false) → true
// posNeg(-1, 1, false) → true
// posNeg(-4, -5, true) → true

import CodingBat.Warmup01.PosNeg;
import org.junit.Assert;
import org.junit.Test;

public class PosNegTest {
    @Test
    public void posFalse() {
        Assert.assertTrue(PosNeg.posNeg(1,-1, false));
    }

    @Test
    public void sampleTest() {
        Assert.assertTrue(PosNeg.posNeg(-1,1, false));
    }

    @Test
    public void negFalse() {
        Assert.assertFalse(PosNeg.posNeg(-1,-1, false));
    }
}
