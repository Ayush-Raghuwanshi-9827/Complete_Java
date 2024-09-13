package Convert;

public class EuclideanMethod {
    public static void main(String[] args) {
        GCD(24,36);
    }
    public static int GCD(int num1, int num2){
        while (num1 != 0 && num2 != 0) {
            if(num1 > num2){
                num1 -= num2;
            }else{
                num2 -= num1;
            }   
        }
        if (num1 == 0) {
            return num2;
        }else{
            return num1;
        }
    }
}
