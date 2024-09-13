package Convert;

public class DecimalToBinary {
    public static void main(String[] args) {
        System.out.println("Binary num is : " + convert(5));
    }
    static int convert(int num){
        int result = 0;
         int power = 0;
         while (num > 0) {
            int rem = num % 2;
             num = num / 2;
             result +=  rem *  Math.pow(10, power);
             power++;
         }
 


        return result;
    }
}
