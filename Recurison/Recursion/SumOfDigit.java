package Recursion;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println(productofDigit(1234));
        System.out.println(sumofDigit(1234));
    }
    static int sumofDigit(int n){
      if(n == 1){
        return 1;
      }
      return (n % 10) + sumofDigit(n / 10);    
    }

    
    static int productofDigit(int n){
      if(n % 10 == n){
        return n;
      }
      return (n % 10) * sumofDigit(n / 10);    
    }
}
