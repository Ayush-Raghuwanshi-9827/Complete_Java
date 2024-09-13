package QueueJava;

import QueueJava.LinkedList_Implementation.QueueL;

public class ImplementStackUsingTwoQueue {
    public static class stack {
        private QueueL q1 = new QueueL();
        private QueueL q2  = new QueueL();
        private int size = 0;
        
        public Boolean push(int x){
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(x);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
            size++;
            return true;
        }

        public int peek(){
            if (q1.isEmpty()) {
                System.out.println("Stack is Empty");   
            }
            return q1.peek();
        }
     
        
        public int pop(){
            if (q1.isEmpty()) {
                System.out.println("Stack is Empty");   
            }
            size--;
            return q1.remove();
        }

        public int size(){
            return size;
        }
        public Boolean isEmpty(){
            if (size == 0) {
                return true;
                
            }
            return false;
        }
       
        public static void main(String[] args) {
            stack st = new stack();
            st.push(3);
            st.push(55);
            st.push(35);
            st.push(5);
            System.out.println(st.push(44));
            System.out.println(st.pop());
            System.out.println(st.pop());
            System.out.println(st.size());
            System.out.println(st.isEmpty());
            System.out.println(st.peek());
        }
    }
}
