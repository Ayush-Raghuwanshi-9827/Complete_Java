package Recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 23, 234, 4342, 245235};
        int target = 234131;
        System.out.println(Search(arr, target, 0, arr.length -1));
    }

    static int Search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int mid = s + (e - s)/ 2;
        if(arr[mid] == target){
            return mid;
        }else if(arr[mid] > target){
            return Search(arr, target, s, mid-1);
        }
        return Search(arr, target, mid+1, e);
    }
}
