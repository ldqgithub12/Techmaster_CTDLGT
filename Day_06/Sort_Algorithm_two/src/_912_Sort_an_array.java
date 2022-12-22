import java.util.Arrays;

public class _912_Sort_an_array {
    public static int[] sortArray(int[] nums) {
        return quickSort(nums,0,nums.length-1);
    }
    public static int[] quickSort(int[] a,int left,int right){
        if (left >= right){
            return a;
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
        return a;
    }
    public static void main(String[] args) {
        int[] nums = {5,1,1,2,0,0};
        System.out.println(Arrays.toString(sortArray(nums)));
    }
}
