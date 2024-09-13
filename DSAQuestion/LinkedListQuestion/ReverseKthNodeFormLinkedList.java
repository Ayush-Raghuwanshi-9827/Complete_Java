package LinkedListQuestion;
// https://leetcode.com/problems/reverse-nodes-in-k-group/submissions/1214322278/
public class ReverseKthNodeFormLinkedList {
    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);
        Node l5 = new Node(5);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = null;
        Node ans = reverseKGroup(l1, 2);
        print(ans);

    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    public static int len(Node head){
        int n = 0;
        while(head != null){
            n++;
            head = head.next;
        }
        return n;
    }
    public static Node reverseKGroup(Node head, int k) {
       int n = len(head);
       int sec = n / k;
       Node prevHead = null;
       Node currHead = head;
       Node ans = null; 
       for(int i=0; i < sec; i++){
          Node prev = null;
          Node Next = null;
          Node curr = currHead;
         for(int j=0; j < k; j++){
              Next = curr.next;
              curr.next = prev;
              prev = curr;
              curr = Next;
          }
          if(prevHead == null){
             ans = prev;
          }else {
            prevHead.next = prev;
          }
          prevHead = currHead;
          currHead = curr;
       }
       prevHead.next = currHead;
      return ans;
    }
}
