package CodingBat.String01;

public class ComboString {
    public String comboString(String a, String b) {
        // Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on the
        // outside and the longer string on the inside. The strings will not be the same length, but they may be
        // empty (length 0).
        String sString = a.length() < b.length() ? a : b;
        String lString = b.length() > a.length() ? b : a;
        return sString + lString + sString;
    }
}
