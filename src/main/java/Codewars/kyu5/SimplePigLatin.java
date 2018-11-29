package Codewars.kyu5;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 * @url: https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 **/

public class SimplePigLatin {
    public String simplePigLatin(String str) {
        String res = "";

        String[] strArr = str.split(" ");

//        for (int i = 0; i < strArr.length; i++) {
//            strArr[i] = pigify(strArr[i]);
//            res += strArr[i] + " ";
//        }
//        System.out.println(Arrays.toString(strArr));

        // This solution seems to be working but it doesn't work fine if the string contains punctuations
        ArrayList<String> list = new ArrayList<String>();
        for (String s : strArr) {
            list.add(pigify(s));
        }
        for (String s: list) {
            res += s + " ";
        }


        return res.trim();
    }

    static String pigify(String str) {
        String clear = str.replaceAll("\\W", " ").trim();
        String res = clear + "ay";
        if  (clear.length()==0) {
            res = "";
        }
        if (clear.length()==2) {
            res = String.valueOf(clear.charAt(1)) + String.valueOf(clear.charAt(0)) + "ay";
        }
        if (clear.length()>2) {
            res = clear.substring(1) + String.valueOf(clear.charAt(0)) + "ay";
        }
        return res;
    }
}
