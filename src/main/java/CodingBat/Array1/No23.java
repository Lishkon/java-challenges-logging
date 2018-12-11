package CodingBat.Array1;

public class No23 {
    public boolean no23(int[] nums) {
        //  return true if it does not contain a 2 or 3
        return !(contains(nums, 2) || contains(nums, 3));
    }

    private boolean contains(int[] numbers, int target) {

        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == target) {
                return true;
            }
        }
        return false;
    }
}
