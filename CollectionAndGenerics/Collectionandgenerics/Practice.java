package Collectionandgenerics;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Practice {
    // Concatenate String
 public static String Concatenates(String... str){
    StringBuilder sb = new StringBuilder();
    for(String a : str){
        sb.append(a).append(" ");
    }
    return sb.toString();
 }   
 
 public static void main(String[] args) {
    System.out.println(Concatenates("Ayush" , "Raghuwanshi"));

 }
}
