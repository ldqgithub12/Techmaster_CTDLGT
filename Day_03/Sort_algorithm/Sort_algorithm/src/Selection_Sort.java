import java.util.Arrays;

public class Selection_Sort {
    public static void selectionSort(int[] a){
        int n = a.length;
        for (int i = 0;i<n;i++){
            int maxIndex = 0;
            for (int j = 0;j<n-i;j++){
                if (a[j]>a[maxIndex]){
                    maxIndex = j;
                }
            }
            int temp = a[maxIndex];
            a[maxIndex] = a[n-i-1];
            a[n-i-1] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a = {1,3,2,5,7,4};
        selectionSort(a);
    }
}
