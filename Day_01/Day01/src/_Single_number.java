public class _Single_number {
    public static int singleNumber(int[] nums) {
        int[] count_num = new int[60000];
        for (int i = 0;i<nums.length;i++){
            count_num[nums[i]]++;
        }
        for (int i=0;i<nums.length;i++){
            if (count_num[nums[i]] == 1){
                return nums[i];
            }
        }
        return -1;
    }
    public static void main(String[] args) {
       int[] nums = {2,2,1};
        System.out.println(singleNumber(nums));
    }
}
