package PACKAGE_NAME;
public class _283_Move_Zeroes {
    public static void moveZeroes(int[] nums) {
        int temp;
        int j=0;
        for (int i = 0; i < nums.length; ++i) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
}
