package CodingBat.String01;

public class MinCat {
    /*
     * Given two strings, append them together (known as "concatenation") and return the result.
     * However, if the strings are different lengths, omit chars from the longer string so it
     * is the same length as the shorter string. So "Hello" and "Hi" yield "loHi".
     * The strings may be any length.
     * */
    public String minCat(String a, String b) {
        /*
         * minCat("Hello", "Hi") → "loHi"
         * minCat("Hello", "java") → "ellojava"
         * minCat("java", "Hello") → "javaello"
        * */
        int dif = 0;
        if (a.length()==b.length()){
            return a + "" + b;
        } else {
            if (a.length()<b.length()) {
                dif = b.length() - a.length();
                return a + "" + b.substring(dif);
            }

            if (a.length()>b.length()) {
                dif = a.length() - b.length();
                return a.substring(dif) + "" + b;
            }
        }
        return "";
    }

}
