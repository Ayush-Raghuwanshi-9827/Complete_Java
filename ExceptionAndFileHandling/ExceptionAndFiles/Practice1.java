package ExceptionAndFiles;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Division Calculator");
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println(ArithmeticExceptionHandling(a, b));
    }
    public static int ArithmeticExceptionHandling(int a, int b) throws ArithmeticException, RuntimeException{
        try {
            int c = a / b;
            return c;
        } catch(ArithmeticException e) {
              System.out.println("Invalid number division of zero not possible");
              throw new  ArithmeticException();
        } catch(Throwable exc){
            System.out.println(" throwable Exception" + exc);
            throw new RuntimeException();
        } finally {
            System.out.println("This is Finally");
        }
    } 
}
