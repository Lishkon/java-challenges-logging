package kyu8.Warmup02;

public class NoTriples {
    public boolean noTriples(int[] num) {

        for (int i = 0; i < (num.length-2); i++) {
            int first = num[i];
            if (num[i+1]==first && num[i+2]==first) return false;
        }

        return true;
    }
}
