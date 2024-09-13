package LinkedListQuestion;

public class ReverseLinkList {
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
        PrintLinkList.print(l1);
        Node ans = reverseList(l1);
        PrintLinkList.print(ans);
    }
    public static Node reverseList(Node head) {
        Node prev  = null;
        Node curr = head;
        Node nextN = curr;
        while(nextN != null){
              nextN = curr.next;
              curr.next = prev;
              prev = curr;
              curr = nextN;
        }
        return prev; 
     }
    
}
