package LinkedListQuestion;

public class InteractionBWTwoSortedLL {
    public static void main(String[] args) {
        Node l1 = new Node(1);
        Node l2 = new Node(2);
        Node l3 = new Node(3);
        Node l4 = new Node(4);
        Node l5 = new Node(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;


        Node p1 = new Node(2);
        Node p2 = new Node(4);
        Node p3 = new Node(6);
        Node p4 = new Node(8);
        p1.next = p2;
        p2.next = p3;
        p3.next = p4;
        Node ans = findIntersection(l1, p2);
        while (ans != null) {
            System.out.println(ans.val);
            ans = ans.next;
        }

    }
    public static Node findIntersection(Node head1, Node head2)
    {
        // code here.
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = new Node(-1);
        Node temp4 = temp3;
        while(temp1 != null && temp2 != null){
            int val1 = temp1.val;
            int val2 = temp2.val;
            if(val1 == val2){
                Node t = new Node(val2);
                temp4.next = t;
                temp4 = temp4.next;
                temp1 = temp1.next;
                temp2 = temp2.next;
            }else if(val1 < val2){
                temp1 = temp1.next;
            }else {
                temp2 = temp2.next;
            }
        }
        return temp3.next;
    }
}
