package CodingBat.String01;

public class EndsLy {
    public boolean endsLy(String str) {

        if (str.length() >= 2) {
            String ending = String.valueOf(str.charAt(str.length() - 2)) + String.valueOf(str.charAt(str.length()-1));
            return ending.equals("ly");
        } else return false;
    }
}
