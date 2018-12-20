package CodingBat.Array1;

import java.util.Arrays;

public class Front11 {
    public static int[] front11(int[] a, int[] b) {

        if (a.length>0 && b.length==0) {
            return new int[]{a[0]};
        }

        if (b.length>0 && a.length==0) {
            return new int[]{b[0]};
        }
        if (a.length>0 && b.length>0) {
            return new int[]{a[0],b[0]};
        }
        else
            return new int[]{};
    }


//    public static int[] returnNotEmpty(int[] a, int[] b) {
//        if (a.length==0) return b;
//        return a;
//    }



    public static void main(String[] args) {
        System.out.println(Arrays.toString(front11(new int[]{1,2}, new int[]{3})));
        System.out.println(Arrays.toString(front11(new int[]{1,2}, new int[]{})));
        System.out.println(Arrays.toString(front11(new int[]{}, new int[]{2})));
//        System.out.println(Arrays.toString(returnNotEmpty(new int[]{}, new int[]{1})));
    }

}
