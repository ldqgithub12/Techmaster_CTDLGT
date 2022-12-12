package PACKAGE_NAME;

import java.util.Arrays;

public class _1480_Running_Sum_Of_1d_Array {
    public static int[] runningSum(int[] nums) {
        int n = nums.length;
        int sum = nums[0];
        int i = 1;
        while (i<n){
            sum += nums[i];
            nums[i] = sum;
            i++;
        }
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,10,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
}
