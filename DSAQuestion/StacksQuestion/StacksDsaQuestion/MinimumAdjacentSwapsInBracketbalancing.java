package StacksDsaQuestion;
// https://www.geeksforgeeks.org/problems/minimum-swaps-for-bracket-balancing2704/1?utm_source=geeksforgeeks&utm_medium=article_practice_tab&utm_campaign=article_practice_tab
public class MinimumAdjacentSwapsInBracketbalancing {
    public static void main(String[] args) {
        String st = "[]][][";
        System.out.println("Minimum Adjacents Swaps is : " + MinimumSwaps(st));
    }
    public static int MinimumSwaps(String st){
        int open = 0,close = 0, swap = 0, Unb = 0;
        for(int i=0; i < st.length(); i++){
            char ch = st.charAt(i);
            if (ch == '[') {
                open++;
                if (Unb > 0) {
                    swap += Unb;
                    Unb--;
                }
            }else {
                close++;
                Unb = close - open;
            }
        }
        return swap;
    }  
}
