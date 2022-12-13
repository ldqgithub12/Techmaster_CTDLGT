package PACKAGE_NAME;

import java.util.Arrays;

public class _1089_Duplicate_Zero {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
//        for (int i=0;i<n-1;i++){
//            if (arr[i] == 0){
//                for (int j = n-1;j>i;j--){
//                    arr[j] = arr[j-1];
//                }
//                i++;
//            }
//        }
        int i = n-1;
        while (i>0){
            arr[i] = arr[i-1];
            if (arr[i] == 0){
                i--;
            }
            i--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);
    }
}
