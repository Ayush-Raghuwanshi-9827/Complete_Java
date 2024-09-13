package Convert;

public class checkNumIsPalindrome {
    public static void main(String[] args) {
        check(1221);
    }
    static void check(int num){
        int num2 = num;
        int x = 0;
        while (num > 0) {
            x = x * 10;
            x += num  % 10;
            num /= 10;
        }
        // System.out.println(x + " "+ num2);
        System.out.println(x == num2);
    }
}
