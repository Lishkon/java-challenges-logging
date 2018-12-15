package CodingBat.Array1;

public class Make2 {
    public static int[] make2(int[] a, int[] b) {
        int[] res = new int[2];
        if (a.length>1) {
            res[0] = a[0];
            res[1] = a[1];
        }

        if (a.length==1 && b.length>1) {
            res[0] = a[0];
            res[1] = b[0];
        }

        if (a.length==0 && b.length>1){
            res[0] = b[0];
            res[1] = b[1];
        }

        if (a.length==1 && b.length==1){
            res[0] = a[0];
            res[1] = b[0];
        }
        return res;
    }

}
