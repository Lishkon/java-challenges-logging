package LeetCode;

class ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        String stringy = "";
        if (x < 0) {
            stringy = "-" + reverse(Integer.toString(x));

        }
        res = Integer.getInteger(stringy);
        return res;
    }
    String reverse(String str) {
        String output = "";
        char[] tempArr = str.startsWith("-") ? str.replace("-","").toCharArray() : str.toCharArray();
        for (int i = 0; i < str.length(); ) {
            for (int j = str.length()-1; j > 0; j--) {
                tempArr[i] = str.charAt(j);
                i++;
            }
        }

        output = String.valueOf(tempArr);
        return output;
    }
}
