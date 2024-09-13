import java.nio.channels.NetworkChannel;
import java.util.Scanner;
public class DataTypes {
    public static void main(String[] args) {
        // Primitives Data Types

        // int rollno = 64; 
        // char letter = 'r';
        // float marks = 98.67f;
        // double largeDecimalNumbers = 4233142411.2321;
        // long largeInteger = 2120991202657585880L;
        // boolean check = false;
        
        // Scanner input = new Scanner(System.in);
        // System.out.println("Please enter some input");
        // int rollno = input.nextInt();
        // System.out.println("Your roll number is : " + rollno);
          
        // String name = input.nextLine();
        // System.out.println(name);

        // Float marks = input.nextFloat();
        // System.out.println(marks);
        
        // type Casting
        // int sum = (int)(76.33f);
        // System.out.println(sum);



     
        // to find which integer is Largest.

        
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
     
        System.out.println(" a : " + a);
        System.out.println(" b : " + b);
        System.out.println(" c : " + c);
        if(a > b && a > c){
            System.out.println("Lagerst number is : " + a);
        }else if(b > a && b > c){
            System.out.println("Lagerst number is : " + b);
        }else if(c > b && c > a){
            System.out.println("Lagerst number is : " + c);
        }
     


    }
}
