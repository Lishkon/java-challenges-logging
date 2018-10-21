package kyu8;

public class CountingSheep {
    public static String countingSheep(int num) {
        String output = "";
        for (int i = 1; i <= num; i++) {
            output += i + " sheep...";
        }
        return output;
    }
}
