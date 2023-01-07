import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
    private static final int size = 1000;
//    boolean[] hashSetArray;
    List<Integer>[] hashSetArray;
    public MyHashSet() {
        hashSetArray = new List[size];
        for (int i = 0; i<size;i++){
           hashSetArray[i] = new LinkedList<>();
        }
    }
    public void add(int key){
        int hashIndex = hashFunction(key);
        List<Integer> bucket = hashSetArray[hashIndex];
        int indexOfKey = bucket.indexOf(key);
        if (indexOfKey == -1){
            bucket.add(key);
        }

    }
    public boolean contains(int key){
        int hashIndex = hashFunction(key);
        List<Integer> bucket = hashSetArray[hashIndex];
        int indexOfKey = bucket.indexOf(key);
        return indexOfKey != -1;
    }
//    public void remove(int key){
//        int hashIndex = hashFunction(key);
//        hashSetArray[hashIndex] = false;
//    }
    private int hashFunction(int key){
        return key%size;
    }

}
