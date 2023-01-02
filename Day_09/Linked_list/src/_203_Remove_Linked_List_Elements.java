import java.io.PrintStream;

public class _203_Remove_Linked_List_Elements {
    public static void main(String[] args) {

//        Node node1 = new Node(3);
//        Node node2 = new Node(3);
//        Node node3 = new Node(3);
//        Node node4 = new Node(3);
//        Node node5 = new Node(3);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(3);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Node head = node1;
//        Truong hop head null
//        if (head == null){
//            return null;
//        }

        //Truong hop tat ca phan tu trong node list bang val = 3;
//        while (head.val == 3){
//            head = head.next;
//            if(head == null){
//              return null;
//            }
//        }
//        if(head.next==null){
//            return head;
//        }


//        Xoa truong hop val = 3
        Node curr = head;
        while (curr.next != null){
            if (curr.next.val == 3)
            {
                curr.next = curr.next.next;
            }
            else {
                curr =curr.next;
            }
        }
    }
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val = val;
        }
    }
}
