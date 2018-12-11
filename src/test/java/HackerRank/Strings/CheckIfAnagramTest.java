package HackerRank.Strings;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckIfAnagramTest {
    @Test
    public void testIsAnagram() {
        assertTrue(CheckIfAnagram.checkIfAnagram("word", "wrdo"));
        assertTrue(CheckIfAnagram.checkIfAnagram("mary", "army"));
        assertTrue(CheckIfAnagram.checkIfAnagram("stop", "tops"));
        assertTrue(CheckIfAnagram.checkIfAnagram("boat", "btoa"));
        assertFalse(CheckIfAnagram.checkIfAnagram("pure", "in"));
        assertFalse(CheckIfAnagram.checkIfAnagram("fill", "fil"));
        assertFalse(CheckIfAnagram.checkIfAnagram("b", "bbb"));
        assertFalse(CheckIfAnagram.checkIfAnagram("ccc", "ccccccc"));
        assertTrue(CheckIfAnagram.checkIfAnagram("a", "a"));
        assertFalse(CheckIfAnagram.checkIfAnagram("sleep", "slep"));
    }

    @Test
    public void testIAnagram() {
        assertTrue(CheckIfAnagram.checkIfAnagram("word", "wrdo"));
        assertTrue(CheckIfAnagram.checkIfAnagram("boat", "btoa"));
        assertFalse(CheckIfAnagram.checkIfAnagram("pure", "in"));
        assertFalse(CheckIfAnagram.checkIfAnagram("fill", "fil"));
        assertTrue(CheckIfAnagram.checkIfAnagram("a", "a"));
        assertFalse(CheckIfAnagram.checkIfAnagram("b", "bbb"));
        assertFalse(CheckIfAnagram.checkIfAnagram("ccc", "ccccccc"));
        assertFalse(CheckIfAnagram.checkIfAnagram("sleep", "slep"));
    }

    @Test
    public void testcheckAnagram() {
        assertTrue(CheckIfAnagram.checkIfAnagram("word", "wrdo"));
        assertTrue(CheckIfAnagram.checkIfAnagram("word", "Wrdo"));
        assertFalse(CheckIfAnagram.checkIfAnagram("b", "bbb"));
        assertFalse(CheckIfAnagram.checkIfAnagram("ccc", "ccccccc"));
        assertTrue(CheckIfAnagram.checkIfAnagram("a", "a"));
        assertFalse(CheckIfAnagram.checkIfAnagram("sleep", "slep"));
        assertTrue(CheckIfAnagram.checkIfAnagram("boat", "btoa"));
        assertFalse(CheckIfAnagram.checkIfAnagram("pure", "in"));
        assertFalse(CheckIfAnagram.checkIfAnagram("fill", "fil"));
    }

    // Read more: https://javarevisited.blogspot.com/2013/03/Anagram-how-to-check-if-two-string-are-anagrams-example-tutorial.html#ixzz5YkrlnmZA
}
