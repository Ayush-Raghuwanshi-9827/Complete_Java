package SlidingWindow;

public class FindTheKthConsecutiveSum {

    public static void main(String[] args) {
        int[] arr = {7,1,8,10,12,0,5};
        int k = 3;
        int ans = FindKthSum(arr, k, arr.length);
        System.out.println(ans);
    }
    public static int FindKthSum(int[] arr, int k, int n){
        int tempsum =0;
        int sum = 0;
        int a = arr[0];
        int b = arr[1];
        int c = arr[2];
        tempsum = a+b+c;
        for (int i = 0; i < n-k; i++) {
           tempsum = tempsum - arr[i] + arr[i+3];
           if (tempsum > sum) {
               sum = tempsum;
           }
        }
        return sum;
    }
}