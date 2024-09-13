import java.util.Arrays;

public class Counting_Sort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 2, 2, 3, 4, 5};
        System.out.println(Arrays.toString(countingSort(arr)));
    }
    public static int[] countingSort(int arr[]){
        // find K,
        int n = arr.length;
        int k = Integer.MIN_VALUE;
        int res[] = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]>k){
                k = arr[i];
            }
        }
        if(k==Integer.MIN_VALUE){
            System.out.println("Empty Value");
            return res;
        }

        int countArr[] = new int[k+1];

        // find the frequency
        for(int i=0;i<n;i++){
            int index = arr[i];
            countArr[index]+=1;
        }

        // find cumulative frequency
        for(int i=1;i<=k;i++){
            countArr[i] += countArr[i-1];
        }

        //find the sorted array
        for(int i=n-1;i>=0;i--){
            int val = arr[i];
            // a-- & --a
            int countVal = --countArr[val];
            res[countVal] = val;
        }
        return res;
    }
}
