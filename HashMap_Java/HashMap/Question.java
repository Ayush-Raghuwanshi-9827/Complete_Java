package HashMap;

import java.util.HashMap;


public class Question {

    // Given an array, find the most frequent element in it. if there are multiple elements that appear a maximum number of times, point any one of them.
    public static int frequencyMost(int[] arr, int n){
      HashMap<Integer, Integer> hm = new HashMap<>();
      for(int i =0; i < arr.length; i++){
        int key = arr[i];
        if(hm.containsKey(key)){
            hm.put(key, hm.get(key) + 1);
        }else {
            hm.put(key, 1);
        }
      }
      System.out.println(hm.entrySet());
      int maxFreq = 0;
      for(int k : hm.keySet()){
        if(hm.get(k) > maxFreq){
            maxFreq = k;
        }
      }
      return maxFreq;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 4, 3, 2, 4};
        int n = arr.length;
        int res = frequencyMost(arr, n);
        System.out.println(res);

    }
}
