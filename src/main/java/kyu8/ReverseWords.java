package kyu8;

public class ReverseWords {
    public static String reverseWords(String str){

        // Refer to: https://www.codewars.com/kata/reversed-words/train/java
        /*
        * 1. Convert a string to an array
        * 2. Create a for loop
        * 3. Iterate through the array and reverse the words
        * 4. Convert the array back into the string
        * */
        String output = "";
        String[] arrStr = str.split("\\s");

        for (int i = arrStr.length-1; i >= 0; i--) {
            output += arrStr[i] + " ";
        }
        return output.replaceAll("(^\\h*)|(\\h*$)","");
    }

}
