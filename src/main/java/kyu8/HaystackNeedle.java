package kyu8;

/**
 *    Write a function findNeedle() that takes an array full of junk but containing one "needle"
 *    After your function finds the needle it should return a message (as a string) that says:
 *    "found the needle at position " plus the index it found the needle, so:
 *
 *    For instance, this code
 *    <code>findNeedle(new Object[] {"hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"})<code>
 *
 *    should return:
 *
 *    <quote>"found the needle at position 5"</quote>
 *
 *    @url https://www.codewars.com/kata/a-needle-in-the-haystack/train/java
 * */
public class HaystackNeedle {
    public static String findNeedle (Object[] haystack) {
        String needle = "needle";
        int position = 0;

        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] == needle) {
                position = i;
            }
        }

        return "found the needle at position " + position;
    }
}

/*
* Better solution:
*
* public static String findNeedle (Object[] haystack) {
*   return String.format("found the needle at position %d", java.util.Arrays.asList(haystack).indexOf("needle"));
* }
*
* */