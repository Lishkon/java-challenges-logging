package CodingBat.String01;

public class StartWord {
    public String startWord(String str, String word) {
        int lnth = word.length();
        String reg = "." + word.substring(1);
        if (str.length()>=lnth) {
            if (str.substring(0,lnth).matches(reg)){
                return str.substring(0,lnth);
            }
        }
        return "";
    }

}
