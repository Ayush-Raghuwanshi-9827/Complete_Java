import java.util.Arrays;

public class RotateArray {
    
    public static void main(String[] args) {
        int[] arr = new int[6];

        for (int i=0; i< arr.length; i++) {
            arr[i] = i+1;
        }

        rotateArray(arr, arr.length, 3);
        System.out.println(Arrays.toString(arr));

    }

    public static void rotateArray(int[] arr, int n, int k){
        ReverseAnArray.swap(arr, 0, n-1);
        ReverseAnArray.swap(arr, 0, k-1);
        ReverseAnArray.swap(arr, k, n-1);
    }
}
