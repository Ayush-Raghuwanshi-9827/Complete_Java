package StacksDsaQuestion;

import java.util.Stack;

// https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/submissions/1184904328/
public class ValidParaentheses {
    public static void main(String[] args) {
        String str = "())";
        System.out.println(minAddToMakeValid(str));
    }
    public static int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else {
                if(st.size() == 0 || st.peek() == ')'){
                    st.push(ch);
                }else {
                    st.pop();
                } 
            }
        }
        return st.size();
    }
    
}
