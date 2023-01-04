public class Main {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(10);
        for (int i = 0; i<10;i++){
            myQueue.dequeue(i);
        }
        myQueue.print();
        myQueue.enqueue();
        myQueue.print();
    }
}
