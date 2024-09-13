package LinkedListQuestion;
public class PairwiseSwapOfTwoNodes {

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
        Node ans = PairwiseSwaping(l1);
        System.out.println(ans.val);
        System.out.println(ans.next.val);
        System.out.println(ans.next.next.val);
        System.out.println(ans.next.next.next.val);
        System.out.println(ans.next.next.next.next.val);
        System.out.println(ans.next.next.next.next.next.val);


    }
    public static Node PairwiseSwaping(Node head){
        Node first = head;
        Node prev = null;
        while (first != null && first.next != null) {
            Node second = first.next;
            first.next = second.next;
            second.next = first;
            if(prev == null){
                head = second;
            }else {
                prev.next = second;
            }
            prev = first;
            first = first.next;
        }
        return head;
    }
}