public class _268_Missing_Number {
    public static int[] sort(int[] a){
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
        return a;
    }
    public static int missingNumber(int[] nums) {
        nums = sort(nums);
        int n = nums.length;
        int left = 0;
        int right = n;
        while (left < right){
            int mid  = (left+right)/2;
            if (nums[mid] > mid){
                right = mid;
            }
            else left=mid+1;
        }
        return left;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missingNumber(nums));
    }
}
