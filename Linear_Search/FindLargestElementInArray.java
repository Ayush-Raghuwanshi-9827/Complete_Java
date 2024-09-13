public class FindLargestElementInArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3 ,4 ,9, 5};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int largest = Integer.MIN_VALUE; 
        if(arr.length < 0){
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > largest){
              largest = arr[i];
            }
        }
        return largest;
    }
}
