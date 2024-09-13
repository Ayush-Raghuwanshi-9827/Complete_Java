package Convert;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
    static long fact(int num){
        int res = 1;
        for (int i = num; i > 1; i--) {
            res = res *  i;
        }
        return res;
    }
}
