public class MyQueueLinkedList {
    Node head;
    Node tail;

    public MyQueueLinkedList() {
    }
    public boolean isEmpty(){
        return head == null;
    }
    public void dequeue(int val){
        Node newNode = new Node(val);
        if (head == null){
            head = tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public  int enqueue(){
        int val = head.val;
        head = head.next;
        return val;
    }
    public void print(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.val+"->");
            curr = curr.next;
        }
        System.out.println("");
    }
}
