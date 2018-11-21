package Codewars.kyu8;

public class ReduceButGrow  {
    public static int grow(int[] x) {
        int result = x[0];
        for (int i = 1; i < x.length; i++){
            result *= x[i];
        }
        return result;
    }

    /*
    * Better solution:
    *
    * public static int grow(int[] x){
    *   return IntStream.of(x).reduce(1, (a, b) -> a * b);
    * }
    *
    * */
}
