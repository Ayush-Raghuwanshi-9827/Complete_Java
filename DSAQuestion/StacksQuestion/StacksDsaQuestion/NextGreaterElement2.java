package StacksDsaQuestion;
// https://leetcode.com/problems/next-greater-element-ii/submissions/1191355558/

import java.util.Arrays;
import java.util.Stack;

public class NextGreaterElement2 {
    public static void main(String[] args) {
        int arr[] = {1,2,1};
        int[] res = nextGreaterElements(arr);
        System.out.println(Arrays.toString(res));
    }
    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i= n-1; i >= 0; i--){
            st.push(nums[i]);
        }
        for(int i = n-1; i >= 0; i--){
            while(!st.isEmpty() &&  st.peek() <= nums[i]){
                st.pop();
            }
            if(st.isEmpty()) res[i] = -1;
            else if(st.peek() > nums[i]){
                res[i] = st.peek();
            }
            st.push(nums[i]);
        }
        return res;
    }
}
