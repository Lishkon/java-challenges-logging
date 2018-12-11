package CodingBat.Array1;

public class MakeMiddle {
    public int[] makeMiddle(int[] nums) {
        int[] res = new int[2];
        if (nums.length>2) {
            res[0] = nums[nums.length/2-1];
            res[1] = nums[nums.length/2];
        } else {
            res = nums;
        }
        return res;
    }
}
