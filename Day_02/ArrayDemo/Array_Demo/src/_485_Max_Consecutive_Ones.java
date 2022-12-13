package PACKAGE_NAME;
public class _485_Max_Consecutive_Ones {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int result =0;
        for (int i = 0;i< nums.length;i++){
            if (nums[i] == 0){
                count = 0;
            }
            else {
                count++;
                result = count > result ? count : result;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,0,1,1,1,0,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
