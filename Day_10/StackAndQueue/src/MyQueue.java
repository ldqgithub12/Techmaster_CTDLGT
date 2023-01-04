public class MyQueue {
    int[] arr;
    int head,tail;
    MyQueue(int size){
        arr = new int[size];
    }
    public boolean isEmpty(){
        return head == tail;
    }
    public void dequeue(int val){
        arr[tail] =val;
        tail++;
    }
    public int enqueue(){
        int first = arr[head];
        head++;
        return first;
    }
    public int getFirst(){
        return arr[head];
    }
    public void print(){
        for (int i=head;i<tail;i++){
            System.out.print(arr[i]+" - ");
        }
        System.out.println("");
    }
    public int getSize(){
        return tail - head;
    }
}
