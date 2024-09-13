package ARRAY_STUFF.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // array in java
        //  Delecleration of an Array. it is defined in the stack
        int[] arr; 
        // Now, initialisation = Actually here object is being created in the memory(heap)
        arr = new int[5];

        // input array element using for loop.

        for(int i = 0; i < arr.length; i++) {
           arr[i] = in.nextInt();
        }

        // output array element using for loop. 

        // for(int i = 0; i < arr.length; i++){
        //     System.out.println(arr[i]);
        // }

           
        // inhanced way to output array element;

        // for(int n : arr){
        //    System.out.println(n);
        // }
        

        // 
        System.out.println(Arrays.toString(arr));
        

       
        
    }
}
