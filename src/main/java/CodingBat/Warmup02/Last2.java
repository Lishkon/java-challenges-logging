package CodingBat.Warmup02;

public class Last2 {
    public int last2(String str) {
        // 1. Create an integer named output, set it to 0
        // 2. Take the first char and check if the next one duplicating it
        // 2.1 If the char is duplicating, increment the output
        // 2.2 If the char is not duplicating, repeat the step 2
        // 2.3 Repeat the steps till str.length()-2
        int charCount = 0;
        int output = 0;
        for (int i = 0; i < str.length()-2; i++) {
            if (str.charAt(i)==str.charAt(i+1)){
                charCount++;
            }
            if (charCount % 2 == 0) {
                output = charCount / 2;
            } else {
                output = charCount;
            }
        }
        return output;
    }
}
