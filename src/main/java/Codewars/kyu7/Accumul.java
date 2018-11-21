package Codewars.kyu7;

import org.apache.commons.lang3.StringUtils;

public class Accumul {
    public static String accum(String s) {

        String output = "";
        String input = s.toLowerCase();
        int printCount = 1;

        for(int i = 0; i < input.length(); i++) {
            String result = "";
            for(int j = 1; j <= printCount; j++) {
                result += input.charAt(i);

            }
            while (i < input.length()-1){
                result += "-";
                break;
            }
            output += StringUtils.capitalize(result);
            printCount++;

        }

        return output;
    }
}

/*
 * More correct solution:
 *
 * public class Accumul {
 *     public static String accum(String s) {
 *         StringBuilder bldr = new StringBuilder();
 *         int i = 0;
 *         for(char c : s.toCharArray()) {
 *             if(i > 0) bldr.append('-');
 *             bldr.append(Character.toUpperCase(c));
 *             for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
 *             i++;
 *         }
 *         return bldr.toString();
 *    }
 * }
 *
 */