package CodingBat.Array1;

public class Sum2 {
    public int sum2(int[] nums) {

//        Given an array of ints, return the sum of the first 2 elements in the array.
//        If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.

        int sum = 0;
        if (nums.length<2) {
            for (int i : nums) {
                sum+=i;
            }
        } else {
            for (int i = 0; i< 2; i++) {
                sum+=nums[i];
            }
        }
        return sum;
    }
}
