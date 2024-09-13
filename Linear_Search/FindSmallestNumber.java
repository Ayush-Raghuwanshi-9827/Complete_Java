public class FindSmallestNumber {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 6, 2, 1};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
