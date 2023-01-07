import java.util.List;

public class MyHashMap {
    private static final int size = 1000;
    List<Integer>[] myHashMap;

    public MyHashMap() {
        myHashMap = new List[size];
    }
    class Node {
        int key;
        int val;
        Node(int val){
            this.val = val;
        }
    }
}
