package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OddCountTest {
    @Test
    public void fixedTests() {
        assertEquals(7, OddCount.oddCount(15));
        assertEquals(7511, OddCount.oddCount(15023));
    }
}
