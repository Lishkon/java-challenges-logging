package CodingBat.Array1;

public class Reverse3 {
    public int[] reverse3(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            res[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }

        return res;

    }
}
