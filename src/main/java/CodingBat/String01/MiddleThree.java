package CodingBat.String01;

public class MiddleThree {
    public String middleThree(String str) {
        if (str.length()>3) {
            return str.substring(((str.length()/2)-1), ((str.length()/2)+2));
        } else return str;

    }
}
