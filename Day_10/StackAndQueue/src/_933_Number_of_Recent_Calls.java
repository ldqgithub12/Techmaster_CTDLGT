public class _933_Number_of_Recent_Calls {
    MyQueueLinkedList myQueueLinkedList;
    public  _933_Number_of_Recent_Calls() {
        myQueueLinkedList = new MyQueueLinkedList();
    }

    public int ping(int t) {
        while (!myQueueLinkedList.isEmpty() && t- myQueueLinkedList.getFirst()>3000){
            myQueueLinkedList.enqueue();
        }
        myQueueLinkedList.dequeue(t);
        return myQueueLinkedList.msize;
    }

    class MyQueueLinkedList {
        Node head;
        Node tail;
        int msize = 0;

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
            msize++;
        }
        public  int enqueue(){
            int val = head.val;
            head = head.next;
            msize--;
            return val;
        }
        public int getFirst(){
            return head.val;
        }
    }
}
