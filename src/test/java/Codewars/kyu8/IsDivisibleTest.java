package Codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IsDivisibleTest {
    @Test
    public void fixedTests() {
        assertTrue(IsDivisible.isDivisible(4050,27));
        assertTrue(IsDivisible.isDivisible(10000,20));
        assertTrue(IsDivisible.isDivisible(10005,1));
        assertFalse(IsDivisible.isDivisible(4066,27));
        assertFalse(IsDivisible.isDivisible(10005,2));
    }
}
