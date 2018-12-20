package CodingBat.Warmup02;

public class Array123 {
    public static boolean array123(int[] nums) {
        if (nums.length>=3) {
            for (int i = 0; i<nums.length-2; i++) {
                if (nums[i]==1) {
                    if (nums[i+1] == 2 && nums[i+2]==3)
                        return true;
                }
            }

        }
        return false;

    }

}
