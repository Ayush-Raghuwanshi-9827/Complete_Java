package Convert;

public class AmarstorngNum {
    public static void main(String[] args) {
        check(153);
    }
    static void check(int num){
       int num2 = num;
       int x = 0; 
       while (num > 0) {
        x += Math.pow(num % 10, 3);
        num /= 10;
       }
       System.out.println(num2 == x);
    }
}
