package Convert;
import Convert.EuclideanMethod;
public class LCM {
    public static void main(String[] args) {
     System.out.println("LCM is : " + Lcm(12,24));
    }
    
    public static int Lcm(int num1, int num2){
        int res =  (num1 * num2) / GCD(num1, num2);
        return res;
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
