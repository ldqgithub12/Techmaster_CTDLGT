import java.util.Arrays;

public class _414_Third_Maximum_Number {
    public static int thirdMax(int[] nums) {
        int n = nums.length;
        for (int i=1;i<n;i++){
            int ai = nums[i];
            int j =i-1;
            while (nums[j] < ai && j>=0){
                nums[j+1]=nums[j];
                j--;
            }
            nums[j+1] = ai;
        }
        int index_max = 1;
        int i = n-1;
        while (i>0 && index_max !=3){
            if (nums[i] != nums[i-1]){
                index_max++;
            }
            i--;
        }
        if (index_max == 3) return nums[i];
        else return nums[n-1];

    }
    public static void main(String[] args) {
        int[] nums = {3,2,1};
        System.out.println(thirdMax(nums));
    }
}
