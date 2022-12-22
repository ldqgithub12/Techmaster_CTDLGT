import java.util.Arrays;

public class Merge_sort {
    public static int[] mergeSort(int[] a,int left, int right){
        if (left>right){
            return new int[0];
        }
        if (left == right){
            int[] single = {a[left]};
            return single;
        }
        int mid = (left+right)/2;
        int[] a1 = mergeSort(a,left,mid);
        int[] a2 = mergeSort(a,mid+1,right);
        int n = a1.length + a2.length;
        int[] c = new int[n];
        int i = left;
        int j = mid+1;
        int k = left;
        while (i<mid && j < right){
            if (a[i] > a[j]){
                c[k] = a[j];
                j++;
                k++;
            }
            else {
                c[k] = a[i];
                i++;
                k++;
            }
        }
            if (j<= right){
                while (j<right){
                    c[k] = a[j];
                    k++;
                    j++;
                }
            }
            else {
                while (i<mid){
                    c[k] = a[i];
                    k++;
                    i++;
                }
            }

        return c;
    }
    public static int[] merge(int a[],int[] b){
        int n = a.length;
        int m = b.length;
        int[] c = new int[m+n];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i<n && j < m){
            if (a[i] > b[j]){
                c[k] = b[j];
                j++;
                k++;
            }
            else {
                c[k] = a[i];
                i++;
                k++;
            }
        }
        if (j<m){
            while (j<m){
                c[k] = b[j];
                k++;
                j++;
            }
        }
        else {
            while (i<n){
                c[k] = a[i];
                k++;
                i++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[] a = {1,3,5,4,7,6,9,2,8};
        System.out.println(Arrays.toString(mergeSort(a,0,9)));
    }
}
