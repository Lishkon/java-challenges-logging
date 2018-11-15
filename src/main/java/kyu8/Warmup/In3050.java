package kyu8.Warmup;

public class In3050 {
    public boolean in3050(int a, int b){
        boolean flag = false;
        if(((a >= 40) && (a <=50)) && (b >= 40) && (b <=50)) {
            flag = true;
        }

        if (((a >= 30) && (a <=40)) && (b >= 30) && (b <=40)) {
            flag = true;
        }

        return flag;
    }
}
