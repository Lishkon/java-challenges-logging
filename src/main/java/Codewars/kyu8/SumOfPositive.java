package Codewars.kyu8;

import java.util.stream.IntStream;

/**
 *  This class contains a method that adds two positive array elements and returns its sum.
 * */
public class SumOfPositive {
    /**
     *  This method returns the sum of all positive array elements that it accepts as input <br>
     *  I.e., for given array <code>{1,2,3,-1,-4,3,2}</code> following value will be returned: <code>11</code> <br>
     *  Because values <code>-1, -4, -3</code> are negative.
     *
     *  @param input an array of integers, both positive and negative. May be of any length
     *  @return output that is 0 by default. Also, when an array contains only of integers, or is empty,
     *          <code>sum</code> is returned.
     * */


    public static int[] countPositivesSumNegatives(int[] input) {
        int positiveCount = (int) IntStream.of(input).filter(s-> s > 0).count();
        int negativeSum = IntStream.of(input).filter(s-> s < 0).sum();
        int[] output = {positiveCount, negativeSum};
        if (input.length == 0 || input.equals(null)) {
            output = new int[0];
        }

        try {
            input = null;
        } catch (NullPointerException np) {
            output = new int[0];
        }

        return output;
    }
    // Can also be implemented using the Lambda expression:
    // return Arrays.stream(arr).filter(v -> v > 0).sum();
}
