public class MyStackByLinkedList {
    Node head;

    public MyStackByLinkedList() {
    }
    public void push(int val){
        Node newNode = new Node(val);
        newNode.next =head;
        head = newNode;
    }
    public int pop(){
        if (head == null){
            return -1;
        }
        int val = head.val;
        head = head.next;
        return val;
    }
    public int peek(){
        if (head == null){
            return -1;
        }
        return head.val;
    }
}
