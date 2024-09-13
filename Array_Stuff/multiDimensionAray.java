import java.util.Arrays;
import java.util.Scanner;

public class multiDimensionAray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*
            1 2 3 
            4 5 6
            7 8 9
         */

        //  define a 2D Array

        // int[][] arr = new int[3][3];

        // int[][] arr = {
        //     {1, 2, 3},
        //     {4, 5, 6},
        //     {7, 8, 9}
        // };

        // Input Elements in 2d array
        int[][] arr = new int[3][3];

        for(int row=0; row < arr.length; row++){

            for(int col = 0; col < arr[row].length; col++){
                arr[row][col] = in.nextInt();
            }

        }

        // Output elements of 2D array.
        //   for(int row=0; row < arr.length; row++){

        //     for(int col = 0; col < arr[row].length; col++){
        //         System.out.print(arr[row][col]);
        //     }
        //     System.out.println();

        // }



        //  How to print 2d array by Arrays.toString;

        // for (int i = 0; i < arr.length; i++) {
        //     System.out.println(Arrays.toString(arr[i]));
        // }


        // How to print Array by enhanced for loop

        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
        
    }

}
