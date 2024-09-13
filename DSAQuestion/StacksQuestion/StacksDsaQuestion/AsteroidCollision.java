package StacksDsaQuestion;

import java.util.Stack;

public class AsteroidCollision {
    public static void main(String[] args) {
        int[] asteroid = {-2,-1,1,2};
        int[] ans =  asteroidCollision(asteroid);
        for(int i =0; i < ans.length; i++){
            System.out.println(ans[i]);
        }

    
    }
     public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st = new Stack<>();
        for(int i=0; i < asteroids.length; i++ ){
            int val = asteroids[i];
            if(st.size() == 0 ){
                st.push(val);
            }
            else if((val > 0 && st.peek() > 0) || (val < 0 && st.peek() < 0)) st.push(val);
            else if(val > 0 && st.peek() < 0){
                if(val == st.peek() * -1) st.pop();
                while(st.size() > 0 && st.peek() < 0 && val > st.peek() * -1){
                    st.pop();
                }
            } else if(val < 0 && st.peek() > 0){
                if(val *-1 == st.peek()) st.pop();
                while( st.size() > 0 && val < 0 && val *-1 > st.peek()){
                    st.pop();
                }
            }
        }
        int[] arr = new int[0];
        if(st.size() == 0) return arr;
        else {
        arr = new int[st.size()];
        for(int i= arr.length -1; i >=0 ; i--){
            arr[i] = st.pop();
        }
         return arr;
    }
  }
}
