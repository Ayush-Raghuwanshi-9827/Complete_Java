package HashMap;

import java.util.HashMap;
import java.util.HashSet;

public class MinimumNoSubsetsDistinctElement {

    public static void main(String[] args) {
        int[] arr = {2,1,4,1,6,5,5,5};
        int ans = CountNumberOfSet(arr);
        System.out.println("Number subsets of Distinct element is : " + ans);
    }
    // Better approch
    public static int CountNumberOfSet(int[] arr){
        int count =0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i : arr) {
            hm.put(arr[i], hm.getOrDefault(hm.get(arr[i]), 0)+1);
            if (hm.get(arr[i]) > count) {
                count = hm.get(arr[i]);
            }
        }
        return count;
    }

    // Problem solve by using hashset
    public static int CountNumberOfSets(int[] arr){
        int count = 0;
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
           if (visited[i]) {
               continue;
           }
           count++;
           HashSet<Integer> hs = new HashSet<>();
           for (int j = i; j < arr.length; j++) {
               if (visited[j] || hs.contains(arr[j])) {
                   continue;
               }
               visited[j] = true;
               hs.add(arr[j]);
           }
        }
        return count;
    }
}