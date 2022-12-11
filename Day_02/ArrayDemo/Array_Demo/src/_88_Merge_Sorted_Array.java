import java.util.Arrays;

public class _88_Merge_Sorted_Array {
    public static void mergeSortedArray(int[] a1,int n, int[] a2,int m){
        for (int j = 0; j < m; j++) {
            chenPhanTu(a2[j],a1,n,j);
            n++;
        }
        System.out.println(Arrays.toString(a1));
    }

    private static void chenPhanTu(int ai, int[] a1, int n,int j) {
        int i = 0;
        while (ai > a1[i] && i<n){
            i++;
        }
        for (int k = n-1;k>=i;k--){
            a1[k+1] = a1[k];
        }
        a1[i] = ai;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,3,5,0,0,0};
        int[] nums2 = {2,4,6};
        mergeSortedArray(nums1,3,nums2,3);
    }
}
