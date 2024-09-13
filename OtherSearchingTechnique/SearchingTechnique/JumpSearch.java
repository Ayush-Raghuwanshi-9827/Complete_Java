package SearchingTechnique;
public class JumpSearch {

    public static void main(String[] args) {
        int[] arr = {2};
        int target = 2;
        System.out.println(jumpSearch(arr, target));

    }
    public static int jumpSearch(int[] arr, int target){
        int n = arr.length;
        int block = (int) Math.sqrt(arr.length);
        int start =0;
        int end = block;
        while (end < n && arr[end] <= target) {
            start = end;
            end = end + block;
            if (end > n) {
                end = n;
            }
        }
        for(int i =start; i < end; i++){
             if (arr[i] == target) {
                return i;
                
             }
        }
        return -1;
    }
}