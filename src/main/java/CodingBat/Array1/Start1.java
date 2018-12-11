package CodingBat.Array1;

public class Start1 {
    public int start1(int[] a, int[] b) {
        if (a.length>0 && a[0]==1) {
            if (b.length>0 && b[0]==1) {
                return 2;
            }
            return 1;
        } else if(a[0]!=1 && b[0]==1) {
            return 1;
        }
        return 0;
    }
}
