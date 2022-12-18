public class _35_Search_Insert_Position {
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
//        if (nums[n-1] < target) return n;
//        for (int i =0;i<n;i++){
//            if (nums[i] == target){
//                return i;
//            }
//            else if (target < nums[i]){
//                return i;
//            }
//        }
//        return 0;
        int left=0;
        int right=n;
        int mid=(left+right)/2;
        if(n == 0) return 0;
        if(nums[left] > target) return 0;
        if(nums[right-1] < target) return n;
        while(left < right){
            if(nums[mid] > target){
                right = mid;
                mid = (left+right)/2;
            }else if(nums[mid] < target){
                left = mid;
                mid = (left+right)/2;
            }else{
                return mid;
            }
            if(left == mid){
                if(nums[left] == target)return left;
                else return right;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,5,6};
        System.out.println(searchInsert(nums,2));
    }
}
