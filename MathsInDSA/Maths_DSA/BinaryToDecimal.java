package Convert;

public class BinaryToDecimal {
    public static void main(String[] args) {
        System.out.println("Decimal value is : " + convert(100));
    }
    static int convert(int num){
        int result = 0;
        int power = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            result += rem * Math.pow(2, power);
            power++;
        }
        return result;
    }
}
