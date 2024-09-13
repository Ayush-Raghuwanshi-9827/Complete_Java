package Introduction;
public class MergeSort {

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};
        int n = arr.length;
        sort(arr, 0, n-1);
        for(int i=0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void sort(int[] arr, int s, int e) {
       if (s >= e) {
          return;
       }
        int mid = s + (e - s) /2;
       sort(arr, s, mid);
       sort(arr, mid+1, e);
       conquer(arr, s, mid, e);
    }

    public static void conquer(int[] arr, int s, int mid, int e) {
       int[] res = new int[e - s + 1];
       int i1 = s;
       int i2 = mid+1;
       int x = 0;
       while (i1 <= mid && i2 <= e) {
           if(arr[i1] <= arr[i2]){
            res[x++] = arr[i1++];
           }
           if (arr[i1] >= arr[i2]) {
             res[x++] = arr[i2++];
           }
       }
       while (i1 <= mid) {
          res[x++] = arr[i1++];
       }
       while (i2 <= e) {
          res[x++] = arr[i2++];
       }
       for(int i=0 , j = s; i< res.length; i++, j++){
           arr[j] = res[i];
       }

    }



}