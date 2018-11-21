package Codewars.kyu8;

import java.util.Arrays;

/**
 * @url: https://www.codewars.com/kata/convert-number-to-reversed-array-of-digits/train/java
 *
 * @description:
 * Convert number to reversed array of digits
 *
 * Given a random number:
 * You have to return the digits of this number within an array in reverse order.
 *
 * Example:
 * 348597 => [7,9,5,8,4,3]
 * */

public class Digitize {
    public static int[] digitize(long n) {

        String tempString = Long.toString(n);

        int[] output = Arrays.asList(tempString).stream().mapToInt(Integer::parseInt).toArray();

        return output;

    }
}
