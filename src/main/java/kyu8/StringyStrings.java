package kyu8;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 *  This is the function that takes a <code>size</code> and returns a string of
 *  altering <code>'1s'</code> and <code>'0s'</code>. <br>
 *  <br>
 *  The string starts with a <code>1</code>.<br>
 *  A string with <code>size</code> of <code>6</code> should return: <code>`101010`</code> <br>
 *  A string with <code>size</code> of <code>4</code> should return: <code>`1010`</code> <br>
 *  The size will always be positive and will only use while numbers
 *  <br>
 *  See the url for this particular kata: <br>
 *      https://www.codewars.com/kata/stringy-strings/train/java
 * */
public class StringyStrings {
    public static void main(String[] args) {
        int size = 4;
        String output = "1";
        int outputLength = output.length();

        for (int i = 1; i < size; i++) {
//            output += '1';
            if (outputLength == 0) {
                output = "1";
            } else if(output.charAt(i) == '1') {
                System.out.println(output.charAt(i));
                output += '0';
            } else {
                output += '1';
            }
        }


        System.out.println(output);

    }
//    public static String stringy (int size) {
//        String output = "1";
//        int outputLength = output.length();
//        for (int i = 0; i < outputLength; i++) {
//            output += '0';
//            if (output.charAt(outputLength) == '0') {
//                output += '1';
//            }
//        }
//        return output;
//    }

}
