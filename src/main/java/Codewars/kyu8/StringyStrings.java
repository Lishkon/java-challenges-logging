package Codewars.kyu8;

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
class StringyStrings {
    static String stringy(int size) {
        StringBuilder res = new StringBuilder("1");
        if (size > 0) {
            for (int i = 1; i < size; i++) {
                res.append(res.toString().endsWith("1") ? "0" : "1");
            }
        } else res = new StringBuilder(size);

        return res.toString();

    }
}
