package PACKAGE_NAME;

import java.util.Arrays;

public class _1480_Running_Sum_Of_1d_Array {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        for (int i=1;i<n;i++){
            nums[i] = nums[i]+nums[i-1];
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
