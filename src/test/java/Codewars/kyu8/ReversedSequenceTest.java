package Codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class ReversedSequenceTest {
    @Test
    public void testOne() {
        int[] expected = {5,4,3,2,1};
        assertArrayEquals(ReversedSequence.reverse(5), expected);
    }

    @Test
    public void testTwo() {
        int[] expected = {9,8,7,6,5,4,3,2,1};
        assertArrayEquals(ReversedSequence.reverse(9), expected);
    }

}
