import java.util.Arrays;

public class Insertion_Sort {
    public static void insertionSort(int[] a){
        int n = a.length;
        for (int i=1;i<n;i++){
            int ai = a[i];
            int j =i-1;
            while (a[j] < ai && j>0){
                a[j+1]=a[j];
                j--;
            }
            a[j+1] = ai;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a = {3,2,1};
        insertionSort(a);
    }
}
