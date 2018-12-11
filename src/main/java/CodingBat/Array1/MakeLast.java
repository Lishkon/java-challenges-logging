package CodingBat.Array1;

public class MakeLast {
    public int[] makeLast(int[] nums) {
        int[] res = new int[nums.length*2];
        res[res.length-1] = nums[nums.length-1];
        return res;
    }
}
