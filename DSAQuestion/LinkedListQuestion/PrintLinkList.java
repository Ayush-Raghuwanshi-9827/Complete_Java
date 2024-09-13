package LinkedListQuestion;

public class PrintLinkList {
    public static void print(Node head){
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
}
