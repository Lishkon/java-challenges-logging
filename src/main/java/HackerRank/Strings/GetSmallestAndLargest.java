package HackerRank.Strings;

import java.util.SortedSet;
import java.util.TreeSet;

public class GetSmallestAndLargest {
    public String getSmallestAndLargest(String str, int k) {
        String smallest = "";
        String largest = "";

        /*
            // Another way to implement the function;

            String[] strArr = new String[str.length()-(k-1)];
            for (int i = 0; i<str.length()-k+1; i++) {
                strArr[i] = str.substring(i, k+i);
            }

            Arrays.sort(strArr);
            smallest = strArr[0];
            largest = strArr[strArr.length-1];
        */
        SortedSet<String> srdst = new TreeSet<String>();
        for(int i=0;i<=str.length()-k;i++){
            srdst.add(str.substring(i,i+k));
        }
        smallest = srdst.first();
        largest = srdst.last();

        return smallest + "/n" + largest;
    }
}
