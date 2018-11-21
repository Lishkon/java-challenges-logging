package Codewars.kyu8;

public class AbbreviateTwoWords {
    public static String abbrevName (String name) {
        String[] arr = name.split(" ");
        String result = arr[0].charAt(0) + "." + arr[1].charAt(0);
        return result.toUpperCase().replaceAll("(^\\h*)|(\\h*$)","");

        // This is the way it should be implemented the better way:
        //      return name.toUpperCase().replaceAll("(.).*\\s(.).*", "$1.$2");
    }
}
