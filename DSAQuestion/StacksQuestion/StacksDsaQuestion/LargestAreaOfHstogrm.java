package StacksDsaQuestion;

import java.util.Stack;
// https://leetcode.com/problems/largest-rectangle-in-histogram/submissions/1191387301/

public class LargestAreaOfHstogrm {
    public static void main(String[] args) {
        int[] heights = {2,1,5,6,2,3};
        int n = heights.length;
        int[] stack = new int[n+1];
        int index = -1;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<= n; i++){
            int element = (i==n)?0:heights[i];
            while(index != -1 && heights[stack[index]] > element){
                int h = heights[stack[index--]];
                int pv = (index == -1)?-1:stack[index];
                int w = i - pv - 1;
                max = Math.max(max, h*w);
            }
            stack[++index] = i;
        }
        max = (max == Integer.MIN_VALUE) ?0:max;
        System.out.println("The largest Area in Histogram is : " + max);
    }
    //  public static int[] FindSmallerElement(int[] arr, int n, Boolean previos){
    //     int[] res = new int[n];
    //     Stack<Integer> st = new Stack<>();
    //         if(previos){
    //              for(int i= 0; i < n; i++){
    //              while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
    //                  st.pop();
    //              }
    //              if(!st.isEmpty()) res[i] = -1;
    //              else res[i] = st.peek();
    //              st.push(i);
    //              }
    //         }else {
    //              for(int i= n-1; i>= 0; i--){
    //              while(!st.isEmpty() && arr[st.peek()] <= arr[i]){
    //                  st.pop();
    //              }
    //              if(!st.isEmpty()) res[i] = n;
    //              else res[i] = st.peek();
    //              st.push(i);
    //             }
    //     }
    //     return res;
    // }
}
