package ExceptionAndFiles;

import java.util.Scanner;

public class Basic {

    public static void main(String[] args) {
        // What is exception
        /*  -> In java, an exception is a disruptive event that occurs during exception
        of a program, interrupting its normal flow, it's an instance of a program
        that aries while the program is running , such as arithmetics errors, null
        pointer access, or resources overflows.*/
        /*  -> exception are objects in java that encapsulate the information about an error 
         * event, inculding its types and the state of the program when the error occured.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Input two number for division");
        System.out.print("Enter first number : ");
        int a = sc.nextInt();
        System.out.printf("Enter Second number : ");
        int b = sc.nextInt();
        ExceptionHandling(a,b);

        //  System.out.print("Enter name : ");
        //  String name = sc.nextLine();
        //  printName(name);
    }
    public static void ExceptionHandling(int a, int b){
        try{
            System.out.printf("The division of %d and %d is : %d ", a, b, a/b);
        }catch (Throwable th){
            System.out.println("General Exception");
            throw th;
        }
    }
    public static void printName(String name) throws IllegalArgumentException{
        if (name.contains("-")) {
            throw new IllegalArgumentException("Name contains - ");
        }
        System.out.println(name);
    }
}