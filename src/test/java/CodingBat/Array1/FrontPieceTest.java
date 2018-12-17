package CodingBat.Array1;

import org.junit.Assert;
import org.junit.Test;

public class FrontPieceTest {
    @Test
    public void posTest() {
        FrontPiece fp = new FrontPiece();
        Assert.assertArrayEquals(new int[]{1,2}, fp.frontPiece(new int[]{1,2,3,4}));
        Assert.assertArrayEquals(new int[]{1,2}, fp.frontPiece(new int[]{1,2}));
        Assert.assertArrayEquals(new int[]{1}, fp.frontPiece(new int[]{1}));
    }
}
