public class _206_Reverse_Linked_List {
    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        Node ite = node1;
        while (ite != null){
            System.out.print(ite.val + " -> ");
            ite = ite.next;
        }
        Node preNode = null;
        Node curr = node1;
        while (curr != null){
            Node temp = curr.next;
            curr.next = preNode;
            preNode = curr;
            curr = temp;
        }
        System.out.println("");
        while (preNode !=null){
            System.out.print(preNode.val+" -> ");
            preNode = preNode.next;
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
