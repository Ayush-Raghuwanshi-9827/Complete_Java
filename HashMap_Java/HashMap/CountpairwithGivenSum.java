package HashMap;

import java.util.HashMap;

public class CountpairwithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1,5,7,1};
        int k = 6;
        int ans = CountPair(arr, k);
        System.out.println("Count pair of given sum k is : " + ans);
    }
    public static int CountPair(int[] arr, int k){
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int element : arr) {
            hm.put(element, hm.getOrDefault(element, 0)+1);
        }

        for (int element : arr) {
            if (element > k) {
                continue;
            }
            int x = k - element;
            if (hm.getOrDefault(x, 0) > 0 ) {
                    count += hm.get(x);
                    hm.put(element, hm.get(element) -1);
                }if(element == x) {
                    count -= 1;
                }
            }
        return count;
    }
}
