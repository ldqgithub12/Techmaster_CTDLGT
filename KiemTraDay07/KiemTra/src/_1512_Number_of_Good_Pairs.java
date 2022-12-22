public class _1512_Number_of_Good_Pairs {
    public static int numIdenticalPairs(int[] nums) {
        int a = 0;
        for (int i =0;i<nums.length;i++){
            for (int j=0;j<nums.length;j++){
                if (nums[i] == nums[j] && i<j) a++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(numIdenticalPairs(nums));
    }
}
