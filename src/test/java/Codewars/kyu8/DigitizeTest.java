package Codewars.kyu8;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DigitizeTest {
    @Test
    @Ignore
    public void tests() {
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, Digitize.digitize(54321));
    }
}
