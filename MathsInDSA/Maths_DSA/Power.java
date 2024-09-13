package Convert;

public class Power {
    public static void main(String[] args) {
        // System.out.println(pow(1, 3));
        System.out.println(fastxponentiation(2, 7));
    }
    static double pow(int num, int power){
        double result = 1;
        for (int i = 0; i < power ; i++) {
             result = result * num;
        }
        return result;
    }
    static double fastxponentiation(int num, int power){
        double result = 1;
        while (power > 0) {
            if (power % 2 != 0) {
                result = result * num;
                power = (power - 1) / 2;
            }else {
                power /= 2;
            }
            num = num * num;
        }
        return result;
    }
}
