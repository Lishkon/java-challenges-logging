package kyu8.Warmup01;

public class IntMax {
    public int inMax (int a, int b, int c){
        // This code is not being allowed on the platform
//        int[] input = {a, b, c};
//        List lst = Arrays.asList(ArrayUtils.toObject(input));
//        return (int) Collections.max(lst);
        int max;
        max =  (a > b) ? a : b;
        max = (c > max) ? c : max;
        return max;
    }
}
