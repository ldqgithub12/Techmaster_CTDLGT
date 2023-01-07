import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class MyHashMap {
    private static final int size = 1000;
    List<Node>[] myHashMap;

    public MyHashMap() {
        myHashMap = new List[size];
    }
    public void put(int key, int value) {
        int hashIndex = hashFunction(key);
        if(myHashMap[hashIndex] == null){
            myHashMap[hashIndex] = new LinkedList<>();
            myHashMap[hashIndex].add(new Node(key,value));
            return;
        }
        List<Node> bucket = myHashMap[hashIndex];
        Node dummy = new Node(key,value);
        int indexOfKey = bucket.indexOf(dummy);
        if (indexOfKey == -1){
            bucket.add(dummy);
        }
        else {
            bucket.get(indexOfKey).val = value;
        }
    }

    public int get(int key) {
        int hashIndex = hashFunction(key);
        if (myHashMap[hashIndex] == null){
            return -1;
        }
        List<Node> bucket = myHashMap[hashIndex];
        Node dummy = new Node(key,0);
        int indexOfKey = bucket.indexOf(dummy);
        if(indexOfKey == -1){
            return -1;
        }
        else {
            return bucket.get(indexOfKey).val;
        }
    }

    public void remove(int key) {
        int hashIndex = hashFunction(key);
        if (myHashMap[hashIndex] == null){
            return;
        }
        List<Node> bucket = myHashMap[hashIndex];
        Node dummy = new Node(key,0);
        int indexOfKey = bucket.indexOf(dummy);
        if (indexOfKey != -1){
            bucket.remove(indexOfKey);
        }
    }
    private int hashFunction(int key){
        return key%size;
    }
    class Node {
        int key;
        int val;
        Node(int key, int val){
            this.key = key;
            this.val = val;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return key == node.key && val == node.val;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key, val);
        }
    }
}
