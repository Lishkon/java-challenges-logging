package CodingBat.String01;

public class LastChars {
    public String lastChars(String a, String b) {
        String res = "";
        if (a.length()!=0 && b.length()!=0) {
            res = String.valueOf(a.charAt(0)) + String.valueOf(b.charAt(b.length()-1));
        }
        else if(a.length()==0 && (b.length()!=0)) res = "@" + String.valueOf(b.charAt(b.length()-1));
        // One of these conditions (if not both) should be optimized. But they work anyway.
        else if(b.length()==0 && (a.length()!=0)) res = String.valueOf(a.charAt(0)) + "@";
        else if((a.length()==0) && (b.length()==0)) res = "@@";
        return res;
    }
}
