public class _707_Design_Linked_List {
    Node mHead;
    public _707_Design_Linked_List() {

    }

    public int get(int index) {
        Node curr = mHead;
        int idx = 0;
        while (curr !=null){
            if (idx == index){
                return curr.val;
            }
            curr = curr.next;
            idx++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next= mHead;
        mHead = newNode;

    }

    public void addAtTail(int val) {
        if (mHead ==null){
            addAtHead(val);
            return;
        }
        Node curr = mHead;
        Node newNode = new Node(val);
        while (curr.next!=null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index==0){
            addAtHead(val);
            return;
        }
        Node curr = mHead;
        int idx = 0;
        Node newNode = new Node(val);
        while (curr!=null){
            if (idx == index-1){
                newNode.next = curr.next;
                curr.next = newNode;
                return;
            }
            curr = curr.next;
            idx++;
        }
    }

    public void deleteAtIndex(int index) {
        if (index ==0){
            mHead =mHead.next;
        }
        Node curr = mHead;
        int idx = 0;
        while (curr != null){
            if (idx == index-1){
                if (curr.next !=null){
                    curr.next = curr.next.next;
                }
                else {
                    curr.next = null;
                }
            }
            curr =curr.next;
            idx++;
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
