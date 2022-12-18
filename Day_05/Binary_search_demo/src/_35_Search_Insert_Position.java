public class _35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if (nums[n-1] < target) return n;
        for (int i =0;i<n;i++){
            if (nums[i] == target){
                return i;
            }
            else if (target < nums[i]){
                return i;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
}
