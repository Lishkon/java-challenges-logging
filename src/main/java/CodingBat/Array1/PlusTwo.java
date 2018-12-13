package CodingBat.Array1;

public class PlusTwo {
//    public static void main(String[] args) {
//        System.out.println(plusTwo(new int[]{1,2},new int[]{3,4}));
//    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] res = new int[a.length+b.length];
        res[0] = a[0];
        res[1] = a[1];
        res[2] = b[0];
        res[3] = b[1];
        return res;
    }
}
