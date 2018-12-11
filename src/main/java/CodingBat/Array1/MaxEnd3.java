package CodingBat.Array1;

public class MaxEnd3 {
    public int[] maxEnd3(int[] nums) {
        int[] resArr = new int[nums.length];
        int max = nums[0]>nums[nums.length-1] ? nums[0] : nums[nums.length-1];
        for (int i = 0; i<nums.length; i++) {
            resArr[i] = max;
        }
        return resArr;
    }
}
