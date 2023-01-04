public class _155_Min_Stack {
    Node head;
    public _155_Min_Stack() {
        head = null;
    }

    public void push(int val) {
        if (head == null){
            head = new Node(val);
        }
        else {
            Node node = new Node(val);
            node.next=head;
            head = node;
        }
    }

    public void pop() {
       head = head.next;
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        Node cur = head;
        int min = cur.val;
        while (cur != null){
            if (cur.val < min){
                min = cur.val;
            }
            cur = cur.next;
        }
        return min;
    }
    class Node {
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
}
