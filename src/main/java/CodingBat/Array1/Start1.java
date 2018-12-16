package CodingBat.Array1;

public class Start1 {
    public static int start1(int[] a, int[] b) {
        int count = 0;
        if (a.length>=1 && b.length>=1) {
            if (a[0]==1 && b[0]==1) {
                count = 2;
            } else if (a[0]==1 || b[0]==1) {
                count++;
            }

        }

        if (a.length>1 && b.length ==0) {
            count++;
        }

        if (b.length>1 && a.length ==0) {
            count++;
        }


        return count;
    }
}
