package Convert;

public class CheckPrime {
    public static void main(String[] args) {
        checkPrime(7);
    }
    static void checkPrime(int num){
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
               System.out.println("This num " + num + " is not prime");
               return;
            }
        }
        System.out.println("This " + num + " is a prime number");
    }
}
