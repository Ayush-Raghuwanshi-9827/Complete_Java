package LinkedListQuestion;

public class AddTwoNumber {
   public static void main(String[] args) {
      Node l1 = new Node(2);
      Node l12 = new Node(4);
      Node l13 = new Node(3);
      l1.next = l12;
      l12.next = l13;
      Node l2 = new Node(5);
      Node l22 = new Node(6);
      Node l23 = new Node(4);
      l2.next = l22;
      l22.next = l23;
      Node ans = addTwoNumbers(l1, l2);
      Node temp = ans;
      while (temp!= null) {
          System.out.print(temp.val + " ");
          temp = temp.next;
      }
   }
   public static Node addTwoNumbers(Node l1, Node l2) {
    Node temp1 = l1;
    Node temp2 = l2;
    int carry = 0;
    Node temp = null;
    Node head = temp;
    while(temp1 != null || temp2 != null){
        if(temp1 != null && temp2 != null ){
            int sum2 = temp1.val + temp2.val + carry;
            if(sum2 / 10 > 0){
               carry = sum2 / 10;
               sum2 = sum2 % 10;
            } 
            Node tempsum = new Node(sum2);
            if(temp == null){
                temp = tempsum;
            }else {
                temp.next = tempsum;
                temp = temp.next;
            }
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        else if (temp1 != null && temp2 == null){
            int sum2 = temp1.val + carry;
            if(sum2 / 10 > 0){
                carry = sum2 / 10;
                sum2 = sum2 % 10;
            }
            Node tempsum = new Node(sum2);
            if(temp == null){
                temp = tempsum;
            }else {
                temp.next = tempsum;
                temp = temp.next;
            }
            temp1 = temp1.next;
        }
        else if (temp1 == null && temp2 != null){
            int sum2 = temp2.val + carry;
            if(sum2 / 10 > 0){
                carry = sum2 / 10;
                sum2 = sum2 % 10;
            }
            Node tempsum = new Node(sum2);
            if(temp == null){
                temp = tempsum;
            }else {
                temp.next = tempsum;
                temp = temp.next;
            }
            temp2 = temp2.next;
        } 
    }
    return head;
}
}   
