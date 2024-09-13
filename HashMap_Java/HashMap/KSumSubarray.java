package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class KSumSubarray {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 1, 9};
    //     boolean ans = KSum02(arr, 5);
    //     System.out.println("SubArray sum k is : " + ans);

        // int[] ans = KSum03(arr, 5);
        // ArrayList<Integer> ans = subarraySum( arr, arr.length, 5);
        // System.out.println(ans);

        int ans = lenOfLongSubarr(arr, arr.length, 15);
        System.out.println(ans);
    }   

    // First Approch
    public static boolean KSum01(int[] arr, int k){
        boolean ans = false;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    ans = true;
                }
            }
        }
        return ans;
    }

    // Second Approch using 

    public static boolean KSum02(int[] arr, int k){
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
            int  kmx = sum - k;
            if (set.contains(kmx)) {
                return true; 

            }
            set.add(sum);
        }
        return false;
    }

    
    public static int[] KSum03(int[] arr, int k){
        int[] ans = {-1,-1};
        HashMap<Integer, Integer> set = new HashMap<>();
        set.put(0, -1);
        int sum = 0;
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
            int  kmx = sum - k;
            if (set.containsKey(kmx)) {
                ans[0] = set.get(kmx); 
                ans[1] = i;
                break;
            }
            set.put(sum, i+1);
        }
        return ans;
    }
    public static ArrayList<Integer> subarraySum(int[] arr, int n, int k) {
        // Your code here
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> set = new HashMap<>();
        set.put(0, -1);
        int sum = 0;
        for (int i=0; i < arr.length; i++) {
            sum += arr[i];
            int  kmx = sum - k;
            if (set.containsKey(kmx)) {
               ans.add(set.get(kmx));
               ans.add(i+1);
               break;
            }
            set.put(sum, i+2);
        }
        if (ans.isEmpty()) {
            ans.add(-1);
            ans.add(-1);
        }
        return ans;
    }
// 10, 5, 2, 7, 1, 9}
    public static int lenOfLongSubarr (int A[], int N, int k) {
        //Complete the 
        int tempmaxLength = 0;
        int length = 0;
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i< N; i++){
            sum += A[i];
            int kmx = sum - k;
            if(map.containsKey(kmx)){
                tempmaxLength =Math.abs(map.get(kmx) - i);
            }
            if(tempmaxLength > length) {
                length = tempmaxLength;
            }
            map.put(sum, i);
        }
        
        return length;
    }
}
