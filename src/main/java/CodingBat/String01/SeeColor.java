package CodingBat.String01;

public class SeeColor {
    public String seeColor(String str) {
        String color = "";
        if (str.startsWith("red")) color = "red";
        if (str.startsWith("blue")) color = "blue";
        return color;
    }
}
