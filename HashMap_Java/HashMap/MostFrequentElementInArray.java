package HashMap;

import java.util.HashMap;

public class MostFrequentElementInArray {
    public static void main(String[] args) {
        int[] arr = {3,6,8,1,3,6,9, 2,2,2,2,3};
        int ans = most_Frequent_Element(arr);
        System.out.println("The most frequent element in the array is : " + ans);

    }
    public static int  most_Frequent_Element(int[] arr){
        int ans = -1;
        int freq = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                int val = hm.get(arr[i]);
                val += 1;
                hm.put(arr[i], val);
            }else {
                hm.put(arr[i], 1);
            }
            if (hm.get(arr[i]) > freq) {
                ans = arr[i];
                freq = hm.get(arr[i]);
            }
        }
        return ans;
    }
}
