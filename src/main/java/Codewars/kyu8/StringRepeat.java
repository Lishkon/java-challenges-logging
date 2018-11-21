package Codewars.kyu8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        String output = "";
        for(int i = 0; i < repeat; i++) {
            output += string;
        }
        return output;
    }
}

//Better solution:
//
//public class Solution {
//    public static String repeatStr(final int repeat, final String string) {
//        StringBuilder sb = new StringBuilder();
//
//        for (int i = 0; i < repeat; i++) {
//            sb.append(string);
//        }
//
//        return sb.toString();
//    }
//}
