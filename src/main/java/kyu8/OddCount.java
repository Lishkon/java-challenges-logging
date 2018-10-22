package kyu8;

public class OddCount {
    public static int oddCount(int n){
        int result = 0;
        for (int i = n-1; i > 0; i--) {
            if (i % 2 != 0) {
                result++;
            }
        }
        return result;
    }
}

/*
* The more precise solution would be though just return n / 2;
* */
