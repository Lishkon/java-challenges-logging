package CodingBat.Array1;

public class MaxTriple {
    public static void main(String[] args) {
        System.out.println(maxTriple(new int[]{1,5,9}));
    }
    public static int maxTriple(int[] nums) {
        int res = 0;
        if (nums.length>1) {
            int first = nums[0];
            int middle = nums[nums.length/2];
            int last = nums[nums.length-1];
            if (first>middle) {
                res = Integer.max(first,last);
            } else {
                res = Integer.max(middle,last);
            }
        } else {
            res = nums[0];
        }

        return res;
    }
}
