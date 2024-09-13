package Convert;

public class GCD {
    // Highest Common Divisor
    public static void main(String[] args) {
    higestCommonDivisor(0, 5);
  }
    static void higestCommonDivisor(int num1, int num2){
        int min = Math.min(num1, num2);
        while (min > 0) {
            if(num1 % min == 0 && num2%min ==0){
                System.out.println("GCD is : "+ min);
                return;
            }

            min--;
        }
        int max = Math.max(num1, num2);
        System.out.println("GCD is : " + max);

    }
}
