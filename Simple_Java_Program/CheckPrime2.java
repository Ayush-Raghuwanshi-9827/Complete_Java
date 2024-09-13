public class CheckPrime2 {
    public static void main(String[] args) {
        int n = 9;
        for(int i=1; i <= n; i++){
           System.out.println(i + " " + ans(i));
        }
    }
    static String ans(int n){
       if(n <= 1){
        return "is not prime";
       }
       int s = 2;
       while (s * s <= n) {
        if(n % s == 0){
            return " is not prime";
         }
         s++;
       }
       return " is prime";
    }
}
