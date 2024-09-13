package StacksDsaQuestion;

import java.util.ArrayList;
import java.util.Stack;

// Monotonic stack Question
// https://leetcode.com/problems/online-stock-span/submissions/1188551195/
public class OnlineStockSpan {
    public static class StockSpanner {
        Stack<Integer> st;
        ArrayList<Integer> list;
        int i = 0;

        public StockSpanner() {
            st = new Stack<>();
            list = new ArrayList<>();
        }

        public int next(int price) {
            int ans;
            if (st.size() == 0) {
                st.push(i);
                list.add(price);
                ans = (i - (-1));
            } else {
                if (price < list.get(st.peek())) {
                    i++;
                    ans = i - st.peek();
                    st.push(i);
                    list.add(price);
                } else {
                    i++;
                    while (!st.isEmpty() && price >= list.get(st.peek())) {
                        st.pop();
                    }
                    if (st.isEmpty())
                        ans = i - (-1);
                    else
                        ans = i - st.peek();
                    st.push(i);
                    list.add(price);
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        StockSpanner stock = new StockSpanner();
        System.out.println(stock.next(100));
        System.out.println(stock.next(80));
        System.out.println(stock.next(60));
        System.out.println(stock.next(70));
        System.out.println(stock.next(60));
        System.out.println(stock.next(75));
        System.out.println(stock.next(85));

    }
}
