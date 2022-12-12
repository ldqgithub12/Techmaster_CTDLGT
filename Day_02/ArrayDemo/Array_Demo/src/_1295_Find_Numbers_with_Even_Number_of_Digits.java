package PACKAGE_NAME;
public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int result =0;
        for (int i =0;i<nums.length;i++){
            int count = 0;
            while (nums[i] !=0){
                nums[i]=nums[i]/10;
                count++;
            }
            if (count % 2 ==0 ){
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }

}
