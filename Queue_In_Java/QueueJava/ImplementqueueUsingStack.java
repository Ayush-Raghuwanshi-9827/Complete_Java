package QueueJava;

import java.util.Stack;

public class ImplementqueueUsingStack {
    public static class QueueSt {
        Stack<Integer> st1 = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        
        int size = 0;
        public int size(){
            return  size;
        }
        public Boolean Add(int x){
            st1.add(x);   
            size++;
            return true; 
        }
        public int remove(){
            if(st1.size() == 0){
               System.out.print("Queue is empty \n");
               return -1;
            }else if (st1.size() == 1) {
                return st1.pop();
            }
           while (st1.size() != 1) {
            st2.add(st1.pop());
           }
           int x = st1.pop();
           while (st2.size() != 0) {
            st1.push(st2.pop());
           }
           size--;
           return x;
        }
        public int peek() throws Exception{
            if (st1.size() == 0) {
                throw new Exception("Queue is Empty");
            }else if (st1.size() == 1) {
                return st1.peek();
            }
            while (st1.size() != 1) {
                st2.push(st1.pop());
            }
            int x = st1.peek();
            while (st2.size() != 0) {
                st1.push(st2.pop());
            }
            return x;
        }
        public Boolean isEmpty(){
            if (size == 0) {
                return true;
            }
            return false;
        }
        public void display(){
            if (size == 0) {
                System.out.println("Queue is Empty");
                return;
            }
            while (st1.size() != 0) {
                st2.push(st1.pop());
            }
            while (st2.size() != 0) {
                int x = st2.pop();
                st1.push(x);
                System.out.print(x + " ");
            }
        }
    }
    public static void main(String[] args) {
       QueueSt st = new QueueSt();  
       System.out.println(st.Add(97));
       System.out.println(st.Add(77)); 
       System.out.println(st.Add(98)); 
       System.out.println(st.Add(32)); 
       System.out.println(st.Add(44)); 
       System.out.println(st.remove());
       System.out.println(st.size());
       System.out.println(st.isEmpty());
       st.display();
    }

}
