package CodingBat.Array1;

public class BiggerTwo {
    public int[] biggerTwo(int[] a, int[] b) {
        if (sumArr(a)==sumArr(b)) {
            return a;
        }
        return sumArr(a)>sumArr(b) ? a : b;
    }

    int sumArr(int[]a) {
        int sum = 0;
        for (int i = 0; i< a.length; i++) {
            sum+=a[i];
        }
        return sum;
    }

}
