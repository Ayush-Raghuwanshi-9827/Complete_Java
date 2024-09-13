package ExceptionAndFiles;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingWriter {


    public static void main(String[] args){
        String fileName = "javacourse.txt";
        try(FileWriter writer = new FileWriter(fileName)){
            writer.write("This is the best java course \n"); 
            for(int i =0; i < 10; i++){
                writer.write("* ");
            }
            writer.flush();
            System.out.println("File writen succesfully");
        } catch(IOException w){
            System.out.printf("Exception Occures %s \n", w.getMessage());
        } 
    }
}
