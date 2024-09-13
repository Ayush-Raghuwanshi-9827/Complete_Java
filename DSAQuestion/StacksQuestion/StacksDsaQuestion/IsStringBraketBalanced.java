package StacksDsaQuestion;
// https://leetcode.com/problems/valid-parentheses/
import java.util.Stack;

public class IsStringBraketBalanced {

    public static void main(String[] args) {
        String string = "{{}}}";
        Boolean ans = Check(string);
        System.out.println(ans);
    }
    public static Boolean Check(String string){
        Stack<Character> st = new Stack<>();
        for(int i=0; i < string.length(); i++){
            char ch = string.charAt(i);
            if (ch == '{' || ch == '(' || ch == '[') {
                st.push(ch);
            }else {
                if (st.size() == 0) return false;
                if (st.peek() == '(' && ch != ')') return false;
                if (st.peek() == '[' && ch != ']') return false;
                if (st.peek() == '{' && ch != '}') return false;
                else st.pop();
            }
        }
        if (st.isEmpty()) {
            return true;
        }else{
            return false;
        }
    }
}