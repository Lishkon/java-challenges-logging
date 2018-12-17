package CodingBat.Array1;

public class Has23 {
    public boolean has23(int[] nums) {
        for (int a : nums) {
            if (a==2 || a==3) {
                return true;
            }
        }
        return false;
    }
}
