package kyu8;

import org.junit.Test;

import static org.junit.Assert.*;

public class ObjectCheckerTest {
    @Test
    public void simpleTest() {
        assertTrue(ObjectChecker.check(new Object[]{66, 101}, 66));
    }

    @Test
    public void multipleIntegerTest() {
        assertTrue(ObjectChecker.check(new Object[]{80, 117, 115, 104, 45, 85, 112, 115}, 45));
    }

    @Test
    public void charObjectTest() {
        assertTrue(ObjectChecker.check(new Object[]{'t', 'e', 's', 't'}, 'e'));
    }

    @Test
    public void stringObjectTest() {
        assertFalse(ObjectChecker.check(new Object[]{"what", "a", "great", "kata"}, "kat"));
    }
}
