package CodingBat.String01;

public class WithouEnd2 {
    public String withouEnd2(String str) {
        return str.length()< 2 ? "" : str.substring(1,str.length()-1);
    }
}
