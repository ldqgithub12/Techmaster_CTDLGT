public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
//        int x = 0;
//        for (int i = 0; i< nums.length;i++){
//            if (nums[i] != val){
//                nums[x] = val;
//                x++;
//            }
//        }
//        return x;

        int n = nums.length;
        for (int i=0;i<n;i++){
            if (nums[i] == val){
                for (int j = i;j<n-1;j++){
                    nums[j] = nums[j+1];
                }
                n--;
            }
        }
        return n;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums,2));
    }
}
