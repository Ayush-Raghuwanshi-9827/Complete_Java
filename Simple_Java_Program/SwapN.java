import java.util.Arrays;

public class SwapN {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        swap(array, 2, 3);
        System.out.println(Arrays.toString(array));
    }
    static void swap(int[] arr, int index1, int index2){

        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
