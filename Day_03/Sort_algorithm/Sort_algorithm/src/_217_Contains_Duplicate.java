public class _217_Contains_Duplicate {
    public static boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        for (int i = 0;i<n;i++){
            int maxIndex = 0;
            for (int j=0;j<n-i;j++){
                if (nums[maxIndex] <nums[j]){
                    maxIndex = j;
                }
            }
            int temp = nums[maxIndex];
            nums[maxIndex] = nums[n-i-1];
            nums[n-i-1] = temp;
        }
        for (int i=0;i<n-1;i++){
            if (nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
}
