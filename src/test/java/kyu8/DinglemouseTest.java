package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class DinglemouseTest {
    @Test
    public void One() {
        assertArrayEquals(new int[]{1,15,15}, Dinglemouse.humanYearsCatYearsDogYears(1));
    }

}
