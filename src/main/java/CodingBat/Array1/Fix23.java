package CodingBat.Array1;
/*
 * Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.
 * */
public class Fix23 {
    public int[] fix23(int[] nums) {
        int[] res = nums;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==2) {
                if (nums[i+1]==3) res[i+1] = 0;
            }
        }
        return res;
    }
}
