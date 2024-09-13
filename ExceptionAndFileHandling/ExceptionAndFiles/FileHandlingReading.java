package ExceptionAndFiles;

import java.io.FileReader;
import java.io.IOException;

public class FileHandlingReading {
    public static void main(String[] args) {
        String fileName = "javacourse.txt";
        try(FileReader reader = new FileReader(fileName)){
            int read = 0;
            do{
                read = reader.read();
                System.out.print((char) read);
            }while(read != -1);
            System.out.println();
            System.out.println("File Reading Successfully ");

        }catch (IOException e) {
            System.out.printf("Exception occured %s \n" , e.getMessage());
        }

    }
}
