package LinkedListQuestion;
// https://leetcode.com/problems/insertion-sort-list/submissions/1218002246/
public class InsertionSortList {
    public static void main(String[] args) {
        Node l1 = new Node(4);
        Node l2 = new Node(2);
        Node l3 = new Node(1);
        Node l4 = new Node(3);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        Node ans = insertionSortList(l1);
        PrintLinkList.print(ans);
    }
    public static Node insertionSortList(Node head) {
        if(head == null || head.next == null) return head;
        Node temp = head.next;
        Node st = head;
        while(temp != null){
            if(temp.val >= st.val){
                st = temp;
                temp = temp.next;
                continue;
            }
                st.next = temp.next;
                Node prev = null;
                Node t = head;
                while(t != st.next){
                   if(temp.val <= t.val){
                       break;
                   }
                   prev = t;
                   t = t.next;
                }
                if (prev == null) {
                    temp.next = head;
                    head = temp;
                }else {
                    temp.next = prev.next;
                    prev.next = temp;
                }
                temp = st.next;
            }
        return head;
    }
}
