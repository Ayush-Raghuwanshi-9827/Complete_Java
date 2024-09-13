package LinkedListQuestion;

public class SortLinkedLsit {
    public static void main(String[] args) {
        Node l1 = new Node(0);
        Node l2 = new Node(2);
        Node l3 = new Node(0);
        Node l4 = new Node(2);
        Node l5 = new Node(2);
        Node l6 = new Node(2);
        Node l7 = new Node(0);
        Node l8 = new Node(0);
        Node l9 = new Node(0);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        l8.next = l9;
        l9.next = null;
        Node ans = segregate(l1);
        print(ans);

    }
    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
     public static Node segregate(Node head)
    {
        // add your code here
        Node temp = head;
        Node zero = null;
        Node one = null;
        Node two = null;
        Node zeroLast = null;
        Node oneLast = null;
        Node twoLast = null;
        while(temp != null){
            int val = temp.val;
            if(val == 0){
                Node q = new Node(val);
                if(zero == null) {
                    zero = q;
                    zeroLast = zero;
                }
                else {
                    zeroLast.next = q;
                    zeroLast = q;
                }
            }
            if(val == 1){
                Node q = new Node(val);
                if(one == null) {
                    one = q;
                    oneLast = one;
                }
                else {
                    oneLast.next = q;
                    oneLast = q;
                }
            }
             if(val == 2){
                Node q = new Node(val);
                if(two == null) {
                    two = q;
                    twoLast = two;
                }
                else {
                    twoLast.next = q;
                    twoLast = q;
                }
            }
            temp = temp.next;
        }
        if (zeroLast != null && oneLast != null) {
            zeroLast.next = one;
            oneLast.next = two;
        }else if (zeroLast == null && oneLast != null) {
            oneLast.next = two;
        }else if (zeroLast != null && oneLast == null) {
            zeroLast.next = two;
        }
        return zero;
    }
}
