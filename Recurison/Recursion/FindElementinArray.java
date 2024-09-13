package Recursion;

import java.util.ArrayList;

public class FindElementinArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,5};
        findAllIndex(arr, 4, 0);
        System.out.println(list);
    }
    static int helper(int[] arr, int target, int index){
        if(arr[index] == target){
            return index;
        }
        return helper(arr, target, index + 1);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr, int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){

            list.add(index);
        }
        findAllIndex(arr, target, index + 1);
    }
}
