package Codewars.kyu8;

/**
 * @URL: https://www.codewars.com/kata/find-the-smallest-integer-in-the-array/train/java
 * Given an array of integers your solution should find the smallest integer.
 *
 * For example:
 * Given [34, 15, 88, 2] your solution will return 2
 * Given [34, -345, -1, 100] your solution will return -345
 * You can assume, for the purpose of this kata, that the supplied array will not be empty.
 *
 * ============================================================================================
 * Better solution:
 *
 *  public class SmallestIntegerFinder {
 *     public static int findSmallestInt(int[] args) {
 *        return IntStream.of(args).min().getAsInt();
 *     }
 *  }
 * =============================================================================================
 * */

public class SmallestIntegerInTheArray {
    public static int findSmallestInt(int[] args) {
        int temp = 0;

        // Comparing the array's elements one by one
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {

                //Sorting an array to be in ascending order
                if (args[i] > args[j]) {

                    //Using the temp variable to change the array's elements by their places
                    temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }

            }
        }

        // Since we have the array sorted in the ascending order, the args[0] element turns out to be
        // the smallest element in the array, so we return it.
        return args[0];
    }
}
