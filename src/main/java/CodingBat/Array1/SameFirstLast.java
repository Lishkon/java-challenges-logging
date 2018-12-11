package CodingBat.Array1;

public class SameFirstLast {
    public boolean sameFirstLast(int[] nums) {
        if (nums.length>0 && nums[0]==nums[nums.length-1]) {
            return true;
        }
        return false;
    }

}
