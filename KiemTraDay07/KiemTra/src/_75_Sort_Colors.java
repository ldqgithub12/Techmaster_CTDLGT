public class _75_Sort_Colors {
    public static void quickSort(int[] a,int left, int right){
        if (left >= right){
            return ;
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
    }
    public void sortColors(int[] nums) {
        quickSort(nums,0,nums.length-1);
    }
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};

    }
}
