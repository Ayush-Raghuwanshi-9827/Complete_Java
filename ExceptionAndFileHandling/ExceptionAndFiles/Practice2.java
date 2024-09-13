package ExceptionAndFiles;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name which you want to read : ");
        String fileName = sc.nextLine();
        try(FileReader read = new FileReader(fileName)){
            int reader = 0;
            while ((reader = read.read()) != -1) {
                System.out.print((char) reader);
            }
            System.out.println("File reading Successfully");   
        }catch(FileNotFoundException e){
             System.out.printf("File Not found Exception %s\n", e.getMessage());
        }
        catch (IOException e){
            System.out.printf("Exception Occured %s \n", e.getMessage());
        }
    }
}
