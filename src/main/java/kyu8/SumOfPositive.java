package kyu8;
/**
 *  This class contains a method that adds two positive array elements and returns its sum.
 * */
public class SumOfPositive {
    /**
     *  This method returns the sum of all positive array elements that it accepts as input <br>
     *  I.e., for given array <code>{1,2,3,-1,-4,3,2}</code> following value will be returned: <code>11</code> <br>
     *  Because values <code>-1, -4, -3</code> are negative.
     *
     *  @param arr an array of integers, both positive and negative. May be of any length
     *  @return sum that is 0 by default. Also, when an array contains only of integers, or is empty,
     *          <code>sum</code> is returned.
     * */
    public static int sum (int[] arr) {
        int sum = 0;
        for (int num: arr) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }
}
