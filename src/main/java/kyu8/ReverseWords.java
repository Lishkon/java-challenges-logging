package kyu8;

public class ReverseWords {
    public static String reverseWords(String str){

        // Refer to: https://www.codewars.com/kata/reversed-words/train/java

        String output = "";
        String[] arrStr = str.split("\\s");

        for (int i = arrStr.length-1; i >= 0; i--) {
            output += arrStr[i] + " ";
        }
        return output.replaceAll("(^\\h*)|(\\h*$)","");
    }

    /*
    * Might be a better solution:
    *          List Words = Arrays.asList(str.split(" "));
    *          Collections.reverse(Words);
    *          return String.join(" ", Words);
    *
    * */

}
