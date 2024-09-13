package Convert;

import java.util.Arrays;

public class SieveOfNum {
    public static void main(String[] args) {
        sieveAlgorithm(40);
    }
    static void sieveAlgorithm(int num){
        boolean arr[] = new boolean[num + 1];
        Arrays.fill(arr, true);
        int counter = 2;
        while (counter <= num) {
           if(arr[counter] == true){
            for (int i = counter + counter; i <= num; i += counter) {
                arr[i] = false;
            }
           }
           counter++;
        }
        for (int i = 2; i <= num; i++) {
            if (arr[i] == true) {
                System.out.print(i + " ");
            }
        }
    }
}
