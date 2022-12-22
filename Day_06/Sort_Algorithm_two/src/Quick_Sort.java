import java.util.Arrays;

public class Quick_Sort {
    public static void quickSort(int[] a,int left, int right){
        if (left >= right){
            return;
        }
        if (left < right){
            int key = a[(left+right)/2];
            int i = left;
            int j = right;
            while (i<j){
                while (a[i] < key) i++;
                while (a[j] > key) j--;
                if (i <= j ){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                    i++;
                    j--;
                }
            }
            quickSort(a,left,j);
            quickSort(a,i,right);
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int[] a = {1,5,8,9};
        quickSort(a,0,a.length-1);
    }
}
