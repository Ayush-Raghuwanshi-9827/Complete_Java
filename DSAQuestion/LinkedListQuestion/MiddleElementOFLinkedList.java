package LinkedListQuestion;

import java.util.LinkedList;

public class MiddleElementOFLinkedList {
    public static void main(String[] args) {
        Node l1 = new Node(2);
        Node l2 = new Node(3);
        Node l3 = new Node(4);
        Node l4 = new Node(5);
        Node l5 = new Node(22);
        Node l6 = new Node(11);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        Node ans = FindElement(l1);
        System.out.println(ans.val);

       
    }
    public static Node FindElement(Node head){
        Node slow = head;
        Node fast = head;
        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}
