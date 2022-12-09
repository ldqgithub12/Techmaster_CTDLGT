import java.util.Arrays;

public class _1920_Build_Array_from_Permutation {
    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0;i<nums.length;i++){
            result[i] = nums[nums[i]];
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }
}
