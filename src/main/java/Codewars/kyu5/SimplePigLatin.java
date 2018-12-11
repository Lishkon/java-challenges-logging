package Codewars.kyu5;

import java.util.ArrayList;

/*
 * Move the first letter of each word to the end of it, then add "ay" to the end of the word. Leave punctuation marks untouched.
 * @url: https://www.codewars.com/kata/520b9d2ad5c005041100000f/train/java
 **/

public class SimplePigLatin {
    public String simplePigLatin(String str) {
        String res = "";
        String[] strArr = str.split(" ");

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

        String reg = "\\W+|\\s+";
        String lastS = "";
        String clear = "";
        String res = "";


        if (str.length()==1 && str.matches(reg)) {
            res = str;
        } else if (str.length() >=1 && (!str.matches(reg))) {
            res = String.valueOf(str.substring(1)) + str.substring(0,1) + "ay" + lastS;
        }


        if (str.length()>=2 ) {

            if(String.valueOf(str.charAt(str.length()-1)).matches(reg)){
                lastS = str.substring(str.length() - 1);
            }

            if(String.valueOf(str.charAt(str.length()-2)).matches(reg)){
                lastS = str.substring(str.length() - 2);
            }

            clear = str.replaceAll(reg, " ").trim();
            res = String.valueOf(clear.substring(1)) + clear.substring(0,1) + "ay" + lastS;

        }
        return res;
    }
}
