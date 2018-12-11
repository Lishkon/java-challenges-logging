package CodingBat.Array1;

public class MakeEnds {
    public int[] makeEnds(int[] nums) {
        int[] res = new int[2];
        if (nums.length>1) {
            res[0] = nums[0];
            res[1] = nums[nums.length-1];
        } else {
            res[0] = nums[0];
            res[1] = nums[0];
        }
        return res;
    }
}
