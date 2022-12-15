import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _349_Intersection_Of_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2){
        List<Integer> list = new ArrayList<>();
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1<n2){
            for (int i = 0;i<n1;i++){
                for (int j =0;j<n2;j++)
                if (nums1[i] == nums2[j] && !list.contains(nums1[i])){
                    list.add(nums1[i]);
                }
            }
        }
        else {
            for (int i = 0;i<n2;i++){
                for (int j =0;j<n1;j++)
                if (nums2[i] == nums1[j] && !list.contains(nums2[i])){
                    list.add(nums2[i]);
                }
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0;i<result.length;i++){
            result[i]=list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection(nums1,nums2)));
    }
}
