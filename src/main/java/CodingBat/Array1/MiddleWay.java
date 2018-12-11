package CodingBat.Array1;

public class MiddleWay {
    public int[] middleWay(int[] a, int[] b) {
        int[] res = new int[2];
        res[0] = a[a.length/2];
        res[1] = b[b.length/2];
        return res;
     }
}
