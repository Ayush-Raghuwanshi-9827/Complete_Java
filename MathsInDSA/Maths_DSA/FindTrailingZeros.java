package Convert;

public class FindTrailingZeros {
    public static void main(String[] args) {
        System.out.println(trailingZeros(2236));
    }
    static double trailingZeros(double num){
      int count = 0;
      while (num > 0) {
        if(num%10 !=0){
            break;
        }
        count++;
        num /= 10;
      }
      return count;
    }
}
