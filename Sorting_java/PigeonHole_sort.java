import java.util.Arrays;

public class PigeonHole_sort {
    public static void main(String[] args) {
        int[] arr = {24, 23, 22, 25, 21, 22};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void sort(int[] arr){
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i ++){
            if(arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        if(max == Integer.MIN_VALUE){
            System.out.println("Array is empty");
            return;
        }
        int size = max - min + 1;
        int pigeonHole[] = new int[size];
        for(int i = 0; i < n; i++){
            int index = arr[i] - min;
            pigeonHole[index]++;
        }
        int insertIndex = 0;
        for(int j = 0; j < size; j++){
            while (pigeonHole[j] > 0) {
                arr[insertIndex] = j + min;
                insertIndex++;
                pigeonHole[j]--;
            }
        }
    }
}
