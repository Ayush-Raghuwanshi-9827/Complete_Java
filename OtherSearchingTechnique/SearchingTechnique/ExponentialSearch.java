package SearchingTechnique;
public class ExponentialSearch {

    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9,10,12,15};
        int target = 12;
        System.out.println(expoSearch(arr, target));
    }
    public static int expoSearch(int[] arr, int target){
        if (arr[0] == target) {
            return 0;
        }
        int x = 1;
        int n = arr.length;
        while (x < n && arr[x] <= target) {
            x = 2*x;
        }
        int start = x/2; 
        int end = Math.min(x, n);
        while (start <= end) {
            int mid = start + (end -start) /2;
            if (mid < n && arr[mid] == target) {
                return mid;
            }else if (arr[mid] < target) {
                start = mid +1;
            }else {
                end = mid -1;
            }   
        }
        return -1;
    }
}